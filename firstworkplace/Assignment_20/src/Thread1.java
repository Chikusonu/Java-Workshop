import java.util.Scanner;

class MyThread implements Runnable {
    Thread t1, t2;
    Scanner sc = new Scanner(System.in);

    public MyThread() {
        t1 = new Thread(this, "First");
        t2 = new Thread(this, "Second");
        t1.start();
        t2.start();
    }

    public void run() {
        if (Thread.currentThread() == t1) {
            int num = sc.nextInt();
            for (int i = num; i <= 10; i++) {
                System.out.println("Thread: " + Thread.currentThread().getName() + " " + i);
                try {
                    Thread.sleep(1000); // Delay for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class Thread1 {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        
    }
}

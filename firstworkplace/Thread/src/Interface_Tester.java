class MyThread implements Runnable{
	private Thread t1,t2;
	public MyThread() {
		t1=new Thread (this,"First");
		t2=new Thread (this,"Second");
		t1.start();
		t2.start();
		
	}
	
	public void run() {
		for(int i=0;i<100;i++) {
			if(Thread.currentThread()==t1) {
				System.out.println("Hiii");
				try {
					t1.sleep(1000); 
				}catch (Exception e) {
				
				}
			}
		}
		
		for(int i=0;i<100;i++) {
			if(Thread.currentThread()==t2) {
				System.out.println("Hiii");
			}
		}
	}
}
class Interface_Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  new  MyThread();
	}

}

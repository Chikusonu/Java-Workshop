class FirstThread extends Thread{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("Hii");
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				
			}
		}
	}
}

class SecondThread extends Thread{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("Hiili");
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				
			}
		}
	}
}
public class Tester {

	public static void main(String[] args) {
		FirstThread ft= new FirstThread();
		SecondThread st= new SecondThread();
		ft.start();
		st.start();
		

	}

}

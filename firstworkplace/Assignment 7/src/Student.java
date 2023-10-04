
 class Studentinfo {
	private int rollno;
	private String name;
	private double percentage;
	private static int cnt=0;
	
public Studentinfo() {
		
		rollno = 11;
		name = "Pralhad Behera";
		percentage = 94.89;
		cnt++;
	}


	/**
	 * @param rollno
	 * @param name
	 * @param percentage
	 */
	public Studentinfo(int rollno, String name, float percentage) {
		
		this.rollno = rollno;
		this.name = name;
		this.percentage = percentage;
		cnt++;
	}
	
	 public static void showCounter() {
	    	System.out.println("Number of Object created :"+cnt);
	    }



	

}

public class Student{
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Studentinfo std=  new Studentinfo();
Studentinfo.showCounter();
}
}
package in.mindcraft;

public class Employe {
	private int empid;
	private String name;
	private Date dob;
	
	public Employe() {
		empid=101;
		name="abc";
		dob=new Date();
		
	}

	public Employe(int id,String n,int d,int m,int y) {
		empid =id;
		name=n;
		dob=new Date(d,m,y);
	}
}

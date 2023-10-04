class vehicle implements Cloneable{
	private String v_name;
	private int v_launch;
	
	public vehicle(String n,int l) {
		v_name=n;
		v_launch=l;
	}
	public String get_name() {
		return v_name;
	}
	
	public String set_name(String n) {
		v_name=n;
		return v_name;
	}
	
	public int get_launch() {
		return v_launch;
	}
	
	public int set_launch(int l) {
		v_launch=l;
		return v_launch;
	}
	
	protected Object clone() {
        return new vehicle(v_name, v_launch);
    }
	
	
	
	
	
}
public class Tester {
	public  static void main(String []args) {
		vehicle v= new vehicle("tempo",10);
		System.out.println(" vehicle name "+v.get_name());
		 vehicle v2 = (vehicle) v.clone();
		 v2.set_name("Honda");
		 System.out.println(" vehicle name "+v2.get_name());
	}

}

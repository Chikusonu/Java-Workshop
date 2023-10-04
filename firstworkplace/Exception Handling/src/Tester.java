class addInvalid{
	public addInvalid(String Message) {
		super(Message);
	}
}


class Adder{
	private int a;
	private int b;
	public Adder(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public int add() {
		return a+b;
	}
    public void check() throws addInvalid  {
    	if(add()<0) {
    		throw new addInvalid("Addition is less than 0");
    	}
    }
    
}
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adder a= new Adder(1,2);
		try {
			
		}
		

	}

}

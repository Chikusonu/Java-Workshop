class Tester1 {
    private int lid;
    private String make;
    private double cost;
    
    private static int cnt;
    static {
    	cnt=0;
    }


    /**
     * Default constructor
     */
    public Tester1() {
        lid = 10;
        make = "HP";
        cost = 9000;
        System.out.println(lid + " " + make + " " + cost);
        cnt++;
    }

    /**
     * Parameterized constructor
     */
    public Tester1(int lid, String make, double cost) {
        this.lid = lid;
        this.make = make;
        this.cost = cost;
        System.out.println(lid + " " + make + " " + cost);
        cnt++;
    }

    

  
    // Method to set the information
    public void setInfo(int id, String name, double price) {
        lid = id;
        make = name;
        cost = price;
        System.out.println(lid + " " + make + " " + cost);
        
    }
    public static void showCounter() {
    	System.out.println("Number of Object created :"+cnt);
    }
}

public class laptop1 {

    public static void main(String[] args) {
        // Create an object l1 of the Tester class using the default constructor
        Tester1 l1 = new Tester1();

        // Create an object l2 of the Tester class using the parameterized constructor
        Tester1 l2 = new Tester1(11, "Dell", 95000);

        // Call the getid() method on l2 and store the result in the variable result
      Tester1.showCounter();
       }
}

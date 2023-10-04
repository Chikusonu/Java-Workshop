package in.mindcraft;

public class Laptop {
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
    public Laptop() {
        lid = 10;
        make = "HP";
        cost = 9000;
        System.out.println(lid + " " + make + " " + cost);
        cnt++;
    }

    /**
     * Parameterized constructor
     */
    public Laptop(int lid, String make, double cost) {
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

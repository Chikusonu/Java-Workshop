class Tester {
    private int lid;
    private String make;
    private double cost;

    /**
     * Default constructor
     */
    public Tester() {
        lid = 10;
        make = "HP";
        cost = 9000;
        System.out.println(lid + " " + make + " " + cost);
    }

    /**
     * Parameterized constructor
     */
    public Tester(int lid, String make, double cost) {
        this.lid = lid;
        this.make = make;
        this.cost = cost;
        System.out.println(lid + " " + make + " " + cost);
    }

    // Getter method for lid
    public int getid() {
        return lid;
    }

    // Setter method for lid
    public void setid(int lid) {
        this.lid = lid;
    }

    // Method to print the information
    public void getInfo() {
        System.out.println(lid + " " + make + " " + cost);
    }

    // Method to set the information
    public void setInfo(int id, String name, double price) {
        lid = id;
        make = name;
        cost = price;
        System.out.println(lid + " " + make + " " + cost);
    }
}

public class Laptop {

    public static void main(String[] args) {
        // Create an object l1 of the Tester class using the default constructor
        Tester l1 = new Tester();

        // Create an object l2 of the Tester class using the parameterized constructor
        Tester l2 = new Tester(11, "Dell", 95000);

        // Call the getid() method on l2 and store the result in the variable result
        int result = l2.getid();

        // Print the value of result (which is the lid of l2)
        System.out.println("Lid of l2: " + result);

        // Call the setid() method on l2 to change its lid to 3
        l2.setid(3);

        // Call the getInfo() method on l1 to print its information
        l1.getInfo();

        // Call the setInfo() method on l1 to set its information
        l1.setInfo(15, "HP", 3400);
        
       }
}

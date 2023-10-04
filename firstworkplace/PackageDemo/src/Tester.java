import in.mindcraft.*;
public class Tester {

    public static void main(String[] args) {
        // Create an object l1 of the Tester class using the default constructor
        Laptop l1 = new Laptop();

        // Create an object l2 of the Tester class using the parameterized constructor
        Laptop l2 = new  Laptop(11, "Dell", 95000);

        // Call the getid() method on l2 and store the result in the variable result
        Laptop.showCounter();
       }
}
class Employee {
    protected int employeeId;
    protected String name;
    protected double basicSalary;

    public Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: $" + basicSalary);
    }

    public double calculateGrossSalary() {
        return basicSalary;
    }

    public double calculateNetSalary() {
        return calculateGrossSalary() - (0.125 * basicSalary);
    }
}

class Manager extends Employee {
    private double petrolAllowance;
    private double foodAllowance;
    private double otherAllowance;

    public Manager(int employeeId, String name, double basicSalary) {
        super(employeeId, name, basicSalary);
        this.petrolAllowance = 0.08 * basicSalary;
        this.foodAllowance = 0.12 * basicSalary;
        this.otherAllowance = 0.04 * basicSalary;
    }

    public void display() {
        super.display();
        System.out.println("Petrol Allowance: $" + petrolAllowance);
        System.out.println("Food Allowance: $" + foodAllowance);
        System.out.println("Other Allowance: $" + otherAllowance);
    }

    public double calculateGrossSalary() {
        return super.calculateGrossSalary() + petrolAllowance + foodAllowance + otherAllowance;
    }
}

class MarketingExecutive extends Employee {
    private double kilometersTravelled;
    private double tourAllowance;
    private double telephoneAllowance;

    public MarketingExecutive(int employeeId, String name, double basicSalary, double kilometersTravelled) {
        super(employeeId, name, basicSalary);
        this.kilometersTravelled = kilometersTravelled;
        this.tourAllowance = 5 * kilometersTravelled;
        this.telephoneAllowance = 2000;
    }

    public void display() {
        super.display();
        System.out.println("Kilometers Travelled: " + kilometersTravelled + " km");
        System.out.println("Tour Allowance: $" + tourAllowance);
        System.out.println("Telephone Allowance: $" + telephoneAllowance);
    }

    public double calculateGrossSalary() {
        return super.calculateGrossSalary() + tourAllowance + telephoneAllowance;
    }
}

public class Tester {
    public static void printObjects(Employee e) {
        e.display();
        System.out.println("Gross Salary: $" + e.calculateGrossSalary());
        System.out.println("Net Salary: $" + e.calculateNetSalary());
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        Manager manager = new Manager(101, "John Doe", 50000);
        MarketingExecutive marketingExecutive = new MarketingExecutive(102, "Jane Smith", 40000, 1000);

        printObjects(manager);
        printObjects(marketingExecutive);
    }
}

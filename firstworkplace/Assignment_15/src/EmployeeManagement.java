import java.util.*;

class Employee {
    private int emp_id;
    private String emp_name;
    private double emp_salary;

    public Employee() {
        emp_id = 1;
        emp_name = "Pralhad";
        emp_salary = 40000;
    }

    public Employee(int id, String name, double salary) {
        emp_id = id;
        emp_name = name;
        emp_salary = salary;
    }

    public void acceptInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee ID: ");
        emp_id = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter employee name: ");
        emp_name = sc.nextLine();
        System.out.print("Enter employee salary: ");
        emp_salary = sc.nextDouble();
    }

    public String getName() {
        return emp_name;
    }

    public void setName(String name) {
        emp_name = name;
    }

    public int getId() {
        return emp_id;
    }

    public void setId(int id) {
        emp_id = id;
    }

    public double getSalary() {
        return emp_salary;
    }

    public void setSalary(double salary) {
        emp_salary = salary;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Employee Salary: " + emp_salary);
    }
}

public class EmployeeManagement {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("***--- Menu ---***");
            System.out.println("1.Insert Record");
            System.out.println("2.Update Record");
            System.out.println("3.Display Records");
            System.out.println("4.Exit");
            System.out.println("Choose One Option");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    Employee emp = new Employee();
                    emp.acceptInfo();
                    employees.add(emp);
                    break;
                case 2:
                    System.out.print("Enter employee ID to update: ");
                    int empId = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    boolean found = false;
                    for (Employee e : employees) {
                        if (e.getId() == empId) {
                            e.acceptInfo();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee with ID " + empId + " not found.");
                    }
                    break;
                case 3:
                    System.out.println("Employee Records:");
                    for (Employee e : employees) {
                        e.displayInfo();
                        System.out.println("--------------------");
                    }
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }
    }
}

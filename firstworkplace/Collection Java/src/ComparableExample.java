import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    private int rollNumber;
    private String name;
    private double percentage;

    public Student(int rollNumber, String name, double percentage) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.percentage = percentage;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public double getPercentage() {
        return percentage;
    }

    @Override
    public int compareTo(Student otherStudent) {
        // Compare based on rollNumber
        return Integer.compare(this.rollNumber, otherStudent.rollNumber);
        
        // For comparing based on other attributes:
        // return Double.compare(this.percentage, otherStudent.percentage);
        // return this.name.compareTo(otherStudent.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", percentage=" + percentage +
                '}';
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(101, "Alice", 85.5));
        studentList.add(new Student(103, "Bob", 78.9));
        studentList.add(new Student(102, "Carol", 92.0));

        System.out.println("Before sorting:");
        for (Student student : studentList) {
            System.out.println(student);
        }

        Collections.sort(studentList);

        System.out.println("\nAfter sorting:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) throws Exception {
        // Establish a connection to the database
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of ID Make Price");
        int lid = sc.nextInt();
        String make = sc.next();
        double cost = sc.nextDouble();

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test_schema", "root", "root");
        String insertQuery = "INSERT INTO laptop (lid, make, cost) VALUES (?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(insertQuery);
        pstmt.setInt(1, lid);
        pstmt.setString(2, make);
        pstmt.setDouble(3, cost);
        
        int rowsAffected = pstmt.executeUpdate();

        if (rowsAffected > 0) {
            System.out.println("Row inserted successfully!");
        } else {
            System.out.println("Row insertion failed.");
        }

        // Close the connection
        conn.close();
    }
}

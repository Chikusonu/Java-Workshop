import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class BankStudy {

    public static void main(String[] args) throws Exception {
        // Establish a connection to the database
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of customer");
        int accno = sc.nextInt();
        String accname = sc.next();
        double accbalance = sc.nextDouble();

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/bank_system", "root", "root");
        String insertQuery = "INSERT INTO banksystem (acc_no, acc_name, acc_balance) VALUES (?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(insertQuery);
        pstmt.setInt(1, accno);
        pstmt.setString(2, accname);
        pstmt.setDouble(3, accbalance);

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

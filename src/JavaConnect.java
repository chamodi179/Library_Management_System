
import java.sql.*;
import javax.swing.JOptionPane;

public class JavaConnect {
    
    public static Connection connectDb(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library_Management_System","root","");
//            JOptionPane.showMessageDialog(null, "DB Connected!");
            return conn; 
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
    
//    public static void main(String[] args) {
//        Connection connectDb = JavaConnect.connectDb();
//    }
}

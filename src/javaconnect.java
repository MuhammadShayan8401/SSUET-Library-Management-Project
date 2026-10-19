import java.sql.*;
import javax.swing.JOptionPane;

public class javaconnect {
    Connection conn;
    
    public static Connection Connecrfb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\PC Mart\\Desktop\\Java\\LibraryManagementProject\\LibraryNew.db");
            
            return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null , e);
            return null;
            
        }
    }
}

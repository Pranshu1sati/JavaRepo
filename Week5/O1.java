import java.sql.Connection;
import java.sql.DriverManager;

public class O1 {
    public static void main(String[] args) {
        try {
            // load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // create a connection
            String url = "jdbc:mysql://localhost:3306/LocalInstance";
            String username = "root";
            String password = "password@123";

            Connection con = DriverManager.getConnection(url,username,password);

            if (con.isClosed()){
                System.out.println("Connection is Closed !");
            } else {
                System.out.println("Connection is created !");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
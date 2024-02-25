import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Q3 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                String username = JOptionPane.showInputDialog("Enter the username of the database:");
                String password = JOptionPane.showInputDialog("Enter the password for the database:");

                Connection con = ConnectionProvider.getConnection(username, password);

                String query = "INSERT INTO Images(pic) VALUES(?)";

                JFileChooser fileChooser = new JFileChooser();
                int returnVal = fileChooser.showOpenDialog(null);

                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();

                    try (FileInputStream fileInputStream = new FileInputStream(file)) {
                        PreparedStatement pStatement = con.prepareStatement(query);
                        pStatement.setBinaryStream(1, fileInputStream, (int) file.length());
                        pStatement.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Image Inserted Successfully !");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}

class ConnectionProvider {
    private static Connection conn;

    public static Connection getConnection(String username, String password) {
        try {
            if (conn == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/Renocrew";
                conn = DriverManager.getConnection(url, username, password);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}

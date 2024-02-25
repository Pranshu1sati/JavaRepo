import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Q4 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                String username = JOptionPane.showInputDialog("Enter the username of the database:");
                String password = JOptionPane.showInputDialog("Enter the password for the database:");

                Connection con = ConnectionProvider.getConnection(username, password);

                String query = "INSERT INTO myData(data) VALUES(?)"; // Adjusted query for the new table and field

                // Creating a text field
                JTextField textField = new JTextField();
                // Creating a panel to hold the text field
                JPanel panel = new JPanel();
                panel.add(new JLabel("Enter the name:"));
                panel.add(textField);

                // Displaying the panel with the text field
                int result = JOptionPane.showConfirmDialog(null, panel, "Enter Name", JOptionPane.OK_CANCEL_OPTION);
                if (result == JOptionPane.OK_OPTION) {
                    // Getting text from the text field
                    String name = textField.getText();

                    // Inserting the name into the database
                    try {
                        PreparedStatement pStatement = con.prepareStatement(query);
                        pStatement.setString(1, name);
                        pStatement.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Data Inserted Successfully !");
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

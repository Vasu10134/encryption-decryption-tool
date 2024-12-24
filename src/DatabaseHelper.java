import java.sql.*;

public class DatabaseHelper {

    private static final String URL = "jdbc:mysql://localhost:3306/encryption_tool";
    private static final String USER = "root";
    private static final String PASSWORD = "password";  // Replace with your actual MySQL password

    // Establish connection to the database
    public Connection connect() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Encrypt the message (simple Caesar Cipher for demonstration)
    public String encryptMessage(String message) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : message.toCharArray()) {
            encrypted.append((char) (c + 3));  // Shift characters by 3 positions
        }
        return encrypted.toString();
    }

    // Decrypt the message (reverse of Caesar Cipher)
    public String decryptMessage(String encryptedMessage) {
        StringBuilder decrypted = new StringBuilder();
        for (char c : encryptedMessage.toCharArray()) {
            decrypted.append((char) (c - 3));  // Reverse the shift by 3 positions
        }
        return decrypted.toString();
    }

    // Insert the original and encrypted message into the database
    public void insertMessage(String original, String encrypted) {
        String query = "INSERT INTO Messages (original_message, encrypted_message) VALUES (?, ?)";
        try (Connection conn = connect(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, original);
            stmt.setString(2, encrypted);
            stmt.executeUpdate();
            System.out.println("Message stored in the database.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

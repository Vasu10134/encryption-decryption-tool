import java.util.Scanner;

public class EncryptionDecryptionTool {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DatabaseHelper dbHelper = new DatabaseHelper();

        // Input for original message
        System.out.print("Enter message to encrypt: ");
        String message = scanner.nextLine();

        // Encrypt the message
        String encryptedMessage = dbHelper.encryptMessage(message);
        System.out.println("Encrypted message: " + encryptedMessage);

        // Store the original and encrypted message in the database
        dbHelper.insertMessage(message, encryptedMessage);

        // Decrypt the message
        String decryptedMessage = dbHelper.decryptMessage(encryptedMessage);
        System.out.println("Decrypted message: " + decryptedMessage);

        scanner.close();
    }
}

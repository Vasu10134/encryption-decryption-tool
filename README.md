# 🔐 Encryption Decryption Tool 🗝️

This simple Java-based tool allows you to **encrypt** and **decrypt** messages using a basic **Caesar Cipher** algorithm (shift by 3 positions). The tool stores both the original and encrypted messages in a **MySQL** database for reference, enabling easy retrieval and analysis.

## 🌟 Features:
- **Encrypt a message** using a Caesar Cipher (shift by 3 positions) 🔒
- **Decrypt the encrypted message** 🔓
- **Store both original and encrypted messages** in a MySQL database 🗃️
- Simple and efficient command-line interface 💬

## 🛠️ Technologies Used:
- **Java** for backend logic ☕
- **MySQL** for database management 🗄️

## 📋 Setup Instructions:
1. Create a MySQL database and tables by running the `create_database.sql` script 🗂️.
2. Update the MySQL connection details (username, password) in the `DatabaseHelper.java` file 🔑.
3. Compile all Java files and run `EncryptionDecryptionTool.java` to interact with the tool 🖥️.

## ▶️ How to Run:
1. Compile all Java files 💻.
2. Run `EncryptionDecryptionTool.java` to launch the program 🚀.
3. Enter a message when prompted for encryption ✍️.
4. The program will display both the encrypted and decrypted message on the screen 📜, and store them in the database 📊.

## 🚨 Additional Notes:
- Ensure MySQL is running and properly configured before running the program ⚙️.
- The tool currently uses a fixed shift of 3 for encryption/decryption, but can be easily modified for dynamic shifts 🔄.
- Be sure to follow the correct sequence for setting up the database to ensure proper functionality 🛠️.

---

Enjoy using the tool to securely encrypt and decrypt your messages! 🛡️

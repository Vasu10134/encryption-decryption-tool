# Encryption Decryption Tool

This simple Java-based tool allows you to encrypt and decrypt messages using a basic Caesar Cipher algorithm. The tool stores both the original and encrypted messages in a MySQL database for reference. 

## Features:
- Encrypt a message using a Caesar Cipher (shift by 3 positions)
- Decrypt the encrypted message
- Store both original and encrypted messages in a MySQL database

## Technologies Used:
- Java for backend logic
- MySQL for database management

## Setup Instructions:
1. Create a MySQL database using the provided `create_database.sql`.
2. Update the database connection settings in `DatabaseHelper.java` (username, password).
3. Run the program to encrypt, decrypt, and store messages.

## How to Run:
1. Compile and run `EncryptionDecryptionTool.java`.
2. Enter a message when prompted for encryption.
3. The program will display the encrypted and decrypted message, and store them in the database.

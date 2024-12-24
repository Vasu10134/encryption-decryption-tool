CREATE DATABASE encryption_tool;

USE encryption_tool;

CREATE TABLE Messages (
    message_id INT AUTO_INCREMENT PRIMARY KEY,
    original_message TEXT,
    encrypted_message TEXT
);

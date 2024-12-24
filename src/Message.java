public class Message {
    private int messageId;
    private String originalMessage;
    private String encryptedMessage;

    public Message(int messageId, String originalMessage, String encryptedMessage) {
        this.messageId = messageId;
        this.originalMessage = originalMessage;
        this.encryptedMessage = encryptedMessage;
    }

    // Getters and setters for message details
    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public String getOriginalMessage() {
        return originalMessage;
    }

    public void setOriginalMessage(String originalMessage) {
        this.originalMessage = originalMessage;
    }

    public String getEncryptedMessage() {
        return encryptedMessage;
    }

    public void setEncryptedMessage(String encryptedMessage) {
        this.encryptedMessage = encryptedMessage;
    }
}

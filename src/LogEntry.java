import java.util.Date;

public class LogEntry {
    private Date createdAt;
    private Date updatedAt;
    private String message;

    public LogEntry(String message) {
        this.message = message;
        createdAt = new Date();
        updatedAt = new Date();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "\n LOGGBOK" + "\n {Inlägg skapades:  " + createdAt + ", \n Inlägg uppdaterades:  " + updatedAt + ", \n Meddelande: '" + message + '\'' + '}';
    }
    public void update(String newMessage) {
        this.message = newMessage;
        updatedAt = new Date();
    }
}

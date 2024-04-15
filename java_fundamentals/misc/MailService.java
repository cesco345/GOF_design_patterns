package java_fundamentals.misc;
public class MailService {
    public void sendEmail() {
        connect();
        authenticate();
        System.out.println("Email sent");
        disconnect();

    }

    private void connect() {
        System.out.println("Connected to mail service");

    }

    private void disconnect() {
        System.out.println("Disconnected from mail service");

    }

    private void authenticate() {
        System.out.println("Authenticated");

    }

}

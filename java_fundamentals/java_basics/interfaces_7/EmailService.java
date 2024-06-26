
package java_fundamentals.java_basics.interfaces_7;

public class EmailService implements NotificationService {
    @Override
    public void notify(User user) {
        System.out.println("Notifying " + user.getEmail() + "...");
        System.out.println("Done!\n");
    }
}

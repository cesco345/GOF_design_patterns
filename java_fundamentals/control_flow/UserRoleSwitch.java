package java_fundamentals.control_flow;

public class UserRoleSwitch {
    public static void main1(String[] args) {
        String role = "guest"; // Change this to "guest" or any other role as needed

        switch (role) {
            case "admin":
                System.out.println("Admin role selected");
                // Add admin-specific actions or logic here
                break;
            case "guest":
                System.out.println("Guest role selected");
                // Add guest-specific actions or logic here
                break;
            default:
                System.out.println("Unknown role selected");
                // Handle the case where the role is neither "admin" nor "guest"
                break;
        }
    }
}

public class username {
    public static void main(String[] args) {
        String email = "example.user@gmail.com";
        String username = email.substring(0, email.indexOf('@'));
        System.out.println("Username: " + username);
    }
}

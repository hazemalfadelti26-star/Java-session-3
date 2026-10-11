import java.util.Scanner;

public class SimpleLoginL1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (username.equals("admin") && password.equals("12345")) {
            System.out.println("Login successful");
        } else if (!username.equals("admin") && !password.equals("12345")) {
            System.out.println("Incorrect username and password");
        } else if (!username.equals("admin")) {
            System.out.println("Incorrect username");
        } else {
            System.out.println("Incorrect password");
        }
    }
}
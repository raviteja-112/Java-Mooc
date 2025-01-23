
import java.util.Scanner;
import java.util.ArrayList;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> usernames = new ArrayList<>();
        ArrayList<String> passwords = new ArrayList<>();
        usernames.add("alex");
        usernames.add("emma");
        passwords.add("sunshine");
        passwords.add("haskell");

        System.out.print("Enter username:");
        String username = scanner.nextLine();

        System.out.print("Enter password:");
        String password = scanner.nextLine();

        boolean login = false;

        if (usernames.contains(username) && passwords.contains(password)) {
            login = true;
        }

        if (login) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}

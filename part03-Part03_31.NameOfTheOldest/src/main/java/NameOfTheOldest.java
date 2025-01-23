
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int old = 0;
        String name = null;
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] names = input.split(",");
            if (Integer.valueOf(names[1]) > old) {
                old = Integer.valueOf(names[1]);
                name = names[0];
                
            }

        }
        System.out.print("Name of the oldest: " + name);

    }
}

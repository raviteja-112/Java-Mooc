
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        Boolean wasFound = false;
        System.out.print("Search for?");
        String name = scanner.nextLine();
        for (String names_list : list) {
            if (name.equals(names_list)) {
                wasFound = true;
                break;
            }
        }

        if (wasFound) {
            System.out.println(name + " was found!");
        } else {
            System.out.println(name + " was not found!");
        }

    }
}

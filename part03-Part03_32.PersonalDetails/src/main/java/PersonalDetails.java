
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = null;
        int name_length = 0;
        int sum = 0;
        int i = 0;
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] names = input.split(",");
            sum = sum + Integer.valueOf(names[1]);
            int length = names[0].length();
            if (length > name_length) {
                name = names[0];
                name_length = length;
            }
            i = i+1;

        }
        System.out.println("Longest name:" + name);
        System.out.println("Average of the birth years:"+((sum*1.0)/i));

    }
}

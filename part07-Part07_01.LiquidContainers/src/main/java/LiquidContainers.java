
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;
        int max = 100;
        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            System.out.println("");
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            if (command.equals("add") && amount >= 0) {
                if (first <= max) {
                    first = first + amount;
                    if (first >= max) {
                        first = max;
                    }
                }
            } else if (command.equals("move") && amount >= 0) {
                if ((first - amount) >= 0) {
                    second = second + amount;
                    first = first - amount;
                    if (second >= max) {
                        second = max;
                    }
                } else if (first - amount < 0) {
                    second = second + first;
                    first = 0;
                    if (second >= max) {
                        second = max;
                    }
                }
            } else if (command.equals("remove") && amount >= 0) {
                if ((second - amount) >= 0) {
                    second = second - amount;
                } else if ((second - amount) < 0) {
                    second = 0;
                }
            }

        }

    }

}

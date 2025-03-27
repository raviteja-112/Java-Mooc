
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ravi
 */
public class UserInterface {

    private Container firstContainer;
    private Container secondContainer;
    private Scanner scan;

    public UserInterface(Container first, Container second, Scanner scan) {
        this.firstContainer = first;
        this.secondContainer = second;
        this.scan = scan;
    }

    public void start() {
        while (true) {

            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            System.out.println("");
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            if (command.equals("add")) {
                this.firstContainer.add(amount);
            } else if (command.equals("remove")) {
                this.secondContainer.remove(amount);

            } else if (command.equals("move")) {
                if (amount > firstContainer.contains()) {

                    amount = firstContainer.contains();

                }

                firstContainer.remove(amount);

                secondContainer.add(amount);
            }

        }

    }

}


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");

            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            Book newBook = new Book(identifier, name);
            if (!(books.contains(newBook))) {
                books.add(newBook);
            }

        }

        System.out.println("==Items==");

        for (Book book : books) {
            System.out.println(book);
        }

    }
}

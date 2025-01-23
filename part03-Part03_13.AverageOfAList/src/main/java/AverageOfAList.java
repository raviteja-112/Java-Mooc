
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        ArrayList<Integer> numbers = new ArrayList<>();
        int sum  = 0;
        int i = 0;
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            if(num == -1){
                break;
            }
            
//            numbers.add(num);
            sum = sum+num;
            i = i+1;
        }
        
        System.out.println("Average: "+((sum*1.0)/i));

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
    }
}

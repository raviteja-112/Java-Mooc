
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());
        
        System.out.println(num1+" + "+num2+" = "+ (num1+num2));
        
        System.out.println(num1+" - "+num2+" = "+ (num1-num2));
        
        System.out.println(num1+" * "+num2+" = "+ (num1*num2));
        
        System.out.println(num1+" / "+num2+" = "+ ((num1*1.0)/num2));
        


        // Write your program here

    }
}

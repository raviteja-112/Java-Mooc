
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = null;
        
        while(true){
            number = scanner.nextLine();
            if(number.equals("end")){
                break;
            }
            
            int num = Integer.valueOf(number);
            
            System.out.println(num * num * num);
            
        }

    }
}


import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        Boolean isFound = false;
        
        
        try(Scanner fileReader = new Scanner(Paths.get(file))){
            while(fileReader.hasNextLine()){
                if(fileReader.nextLine().equals(searchedFor)){
                    isFound = true;
                    break;
                }else{
                    isFound = false;
                }
            }
            
            
        }catch(Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }
        
        if(isFound){
            System.out.println("Found");
        }else{
            System.out.println("Not found");
        }
    }
}


import java.util.ArrayList;
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

    private ArrayList<Bird> birds;
    private Scanner scan;

    public UserInterface(Scanner scan) {
        this.birds = new ArrayList<>();
        this.scan = scan;
    }

    public void start() {
        while (true) {
            System.out.print("?");
            String cmd = scan.nextLine();
            if (cmd.equals("Add")) {
                addBird();
            }else if(cmd.equals("Observation")){
                observationBird();
            }else if(cmd.equals("All")){
                printAllBirds();
            }else if(cmd.equals("One")){
                getOneBird();
            }else if(cmd.equals("Quit")){
                break;
            }
        }
    }

    public void addBird() {
        System.out.print("Name: ");
        String name = scan.nextLine();

        System.out.print("Name in Latin: ");
        String latinName = scan.nextLine();
        this.birds.add(new Bird(name,latinName));
    }
    
    public void observationBird(){
        System.out.println("Bird? ");
        String name = scan.nextLine();
        boolean isfound = false;
        for(Bird bird:this.birds){
            if(bird.getName().equals(name)){
                bird.addObs();
                isfound = true;
                break;
            }
        }
        
        if(!isfound){
            System.out.println("Not a bird!");
        }
                
               
    }
    
    public void printAllBirds(){
        for(Bird bird :this.birds){
            System.out.println(bird);
        }
    }
    
    public void getOneBird(){
        System.out.print("Bird? ");
        String name = scan.nextLine();
        for(Bird bird:this.birds){
            if(bird.getName().equals(name)){
                System.out.println(bird);
                break;
            }
        }
    }

}

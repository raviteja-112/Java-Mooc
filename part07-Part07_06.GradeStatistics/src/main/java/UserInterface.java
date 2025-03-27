
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
    private GradeStats gradestats;
    private Scanner scan;
    
    public UserInterface(GradeStats gradestats,Scanner scan){
        this.gradestats = gradestats;
        this.scan = scan;
    }
    
    public void start(){
        System.out.println("Enter point totals, -1 stops:");
        while(true){
            int num = scan.nextInt();
            if(num == -1){
                break;
            }
            this.gradestats.addPoints(num);
            
        }
        
        System.out.println("Point average (all): "+this.gradestats.avgAll());
        double avgPass = this.gradestats.avgPass();
        if(avgPass == -1){
            System.out.println("Point average (passing): -");
        }else{
            System.out.println("Point average (passing): "+avgPass);
        }
        
        System.out.println("Pass percentage: "+this.gradestats.passPerc());
        this.gradestats.printGrades(this.gradestats.gradeDistribuition());
        
    }
    
    
}

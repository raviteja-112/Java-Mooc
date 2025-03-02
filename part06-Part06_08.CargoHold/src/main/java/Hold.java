
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ravi
 */
public class Hold {
    
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        int weight = 0;
        for(Suitcase s:this.suitcases){
            weight = weight + s.totalWeight();
        }
        
        if(weight+suitcase.totalWeight() <= this.maxWeight){
            this.suitcases.add(suitcase);
        }
        
    }
    
    public void printItems(){
        for(Suitcase s : this.suitcases){
            s.printItems();
        }
    }
    
    public String toString(){
        int size = this.suitcases.size();
        int weight = 0;

        for(Suitcase s:this.suitcases){
            weight = weight + s.totalWeight();
        }
        
        return size+" suitcases ("+weight+" kg)";
        
    }
    
}

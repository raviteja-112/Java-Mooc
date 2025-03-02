
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
public class Package {
    private ArrayList<Gift> packages;
    
    public Package(){
        this.packages = new ArrayList<>();
    }
    
    public void addGift(Gift gift){
        this.packages.add(gift);
    }
    
    public int totalWeight(){
        int weight = 0;
        
        for(Gift pack : this.packages){
            weight = weight + pack.getWeight();
        }
        
        return weight;
    }
    
    
}

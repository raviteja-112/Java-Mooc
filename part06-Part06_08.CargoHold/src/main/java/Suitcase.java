
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
public class Suitcase {
    
    private ArrayList<Item> items;
    private int maxweight;
    
    public Suitcase(int weight){
        this.items = new ArrayList<>();
        this.maxweight = weight;
    }
    
    public void addItem(Item item){
        if(this.totalWeight()+item.getWeight() <= this.maxweight){
            this.items.add(item);
        }
        
    }
    
    public void printItems(){
        for(Item i:this.items){
            System.out.println(i);
        }
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        for(Item i : this.items){
            totalWeight = totalWeight+i.getWeight();
        }
        
        return totalWeight;
    }
    
    public Item heaviestItem(){
        
        if(this.items.isEmpty()){
            return null;
        }
        
        Item heaviest = this.items.get(0);
        for(Item i: this.items){
            if(heaviest.getWeight() < i.getWeight()){
                heaviest = i;
            }
        }
        
        return heaviest;
    }
    
    public String toString(){
        int noOfItems = this.items.size();
        int weight = 0;
        String print = "";
        
        if(noOfItems == 0){
            print = "no items";
        }
        
        if(noOfItems == 1){
            print = "1 item";
        }
        
        if(noOfItems > 1){
            print = noOfItems+" items";
        }
        
        
        return print+" ("+this.totalWeight()+" kg)";
    }
    
}


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
public class Stack {
    
    private ArrayList<String> vars;

    public Stack() {
        this.vars = new ArrayList<>();
    }
    
    public boolean isEmpty(){    
        return (this.vars.isEmpty());
    }
    
    public void add(String value){
        this.vars.add(0,value);
        
    }
    
    public ArrayList<String> values(){
        return this.vars;
    }
    
    public String take(){
        String required = this.vars.get(0);
        this.vars.remove(0);
        return required;
    }
    
}

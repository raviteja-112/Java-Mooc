
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String longest(){
        
        if(this.elements.isEmpty()){
            return null;
        }
        
        String name = this.elements.get(0);
        int maxLength = name.length();
        
        for(String element : this.elements){
            if(maxLength<element.length()){
                maxLength = element.length();
                name = element;
            }
        }
        
        return name;
    }

}

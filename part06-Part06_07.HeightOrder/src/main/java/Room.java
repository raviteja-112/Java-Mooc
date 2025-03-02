
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
public class Room {

    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        return this.persons.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest() {

        if (this.persons.isEmpty()) {
            return null;
        }

        Person shortest = this.persons.get(0);
        int minHeight = this.persons.get(0).getHeight();

        for (Person p : this.persons) {
            int curentHeight = p.getHeight();

            if (minHeight > curentHeight) {
                minHeight = curentHeight;
                shortest = p;
            }
        }

        return shortest;

    }

    public Person take() {
        
        Person removed = shortest();
        this.persons.remove(removed);
        return removed;
    }
}

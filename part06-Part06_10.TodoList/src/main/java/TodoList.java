
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
public class TodoList {

    private ArrayList<String> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void add(String task) {
        this.tasks.add(task);
    }

    public void print() {
        if (!this.tasks.isEmpty()) {
            int index = 1;
            for (String task : this.tasks) {
                System.out.println(index + ": " + task);
                index++;
            }
        } else {
            System.out.println("To-do list is empty.");
        }
    }

    public void remove(int number) {
        if (number > 0 && number < this.tasks.size() + 1) {
            this.tasks.remove(number - 1);
        } else {
            System.out.println("Index not valid.");
        }
    }
}

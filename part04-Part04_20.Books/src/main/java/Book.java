/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ravi
 */
public class Book {
    private String title;
    private int numberOfPages;
    private int year;
    
    public Book(String title,int numberOfPages,int year){
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.year = year;
    }
    
    public String toString(String command){
        switch (command) {
            case "everything":
                return this.title+", "+this.numberOfPages+" pages, "+this.year;
            case "name":
                return this.title;
            default:
                return null;
        }
        
    }
    
}

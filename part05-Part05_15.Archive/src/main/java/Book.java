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

    private String identifier;
    private String name;

    public Book(String indentifer, String name) {
        this.identifier = indentifer;
        this.name = name;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public String getName() {
        return this.name;
    }
    
    public String toString(){
        return this.identifier+": "+this.name;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return false;
        }

        if (!(compared instanceof Book)) {
            return false;
        }

        Book comparedBook = (Book) compared;

        if (this.identifier.equals(comparedBook.identifier)) {
            return true;
        }

        return false;
    }
}

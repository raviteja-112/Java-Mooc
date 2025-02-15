
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object Compared){
        
        if(this == Compared){
            return true;
        }
        
        if(!(Compared instanceof Book)){
            return false;
        }
        
        Book comparedBook = (Book) Compared;
        
        if(this.publicationYear == comparedBook.publicationYear && 
                this.name.equals(comparedBook.name)){
            
            return true;
            
        }
            return false;
            
            
        }
  
}


public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        if(this.squares > compared.squares){
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared){
        int price = (this.squares*this.princePerSquare)-(compared.princePerSquare*compared.squares);
        if(price < 0){
            price = price*-1;
        }
        return price;
    }
    
    
    public boolean moreExpensiveThan(Apartment compared){
        if(compared.princePerSquare < this.princePerSquare){
            return true;
        }
        return false;
    }

}

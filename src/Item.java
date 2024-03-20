import java.util.ArrayList;

/**
 * A class to model an item in the Supermarket
 *
 * @author 50017859
 * @version 20/03/2024
 */
public class Item {
    private int price; //delcare variable
    private String Description; //declare variable
    private int Quantity;

    public Item(int aPrice, String aDescription){ //Constructor for Item Class - Creates a usable Item Object
        this.price = aPrice;
        this.Description = aDescription;
    }

    public int getPrice(){ //getter method
        return this.price;
    }

    public String getDescription(){ //getter method
        return this.Description;
    }

    public int getQuantity(){
        return this.Quantity;
    }

    public void setPrice(int aPrice){
        this.price = aPrice;
    }

    public void setDescription(String aDescription){
        this.Description = aDescription;
    }
    public void setQuantity(int aQuantity){
        this.Quantity = aQuantity;
    }

    @Override
    public String toString(){ //STATE OF AN OBJECT IS THE COLLECTIVE VALUE OF ITS FIELDS
        return "An object of " + this.getClass() + " with description " + getDescription() + " and price " + getPrice();
    }
}

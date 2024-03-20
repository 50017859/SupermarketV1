import java.util.ArrayList;

/**
 * A class to model a transaction in the Supermarket
 *
 * @author 50017859
 * @version 20/03/2024
 */
public class Transaction {
    private ArrayList<Item> items;

    public Transaction(){
        items = new ArrayList<>();
    }

    /**
     * Adds an item object to the transaction
     * @param anItem the item to add
     */
    public void addItem(Item anItem){
        this.items.add(anItem);
    }

    /**
     * Returns the number of items that are currently in the transaction
     */
    public int getNumberOfItems(){
        return this.items.size();
    }

    /**
     * @return the sum of all  items in the transaction
     */
    public int getSubTotal(){
        int subTotal = 0;

        for (Item i : items){
            subTotal = subTotal + i.getPrice();
        }

        return subTotal;
    }

    /**
     * removes last item that was added to the transaction
     */
    public void removeLastItem(){
        int lastItem = items.size() -1;
        this.items.remove(lastItem);
    }

    /**
     * Reduces the total left to pay by the given amount
     *if the given amount is equal to or greater than the subtotal, the transaction is cleared and the amount of change to ve given is returned
     * @param anAmount the amount to pay towards to the subtotal
     * @return the amount of change that is due
     */
    public int pay(int anAmount) {
        int change = 0;

        if (anAmount >= this.getSubTotal()) {
            change = anAmount - this.getSubTotal();

            this.items.clear();
        }

        return change;
    }

    public void recepit(){
        System.out.println("\nHAPPY SHOPPER SUPERMARKET");
        System.out.println("*************************");

        for (Item item : this.items){
            System.out.println(item.getDescription() + " " + item.getPrice());
        }

        System.out.println("*************************");
        System.out.println(this.getSubTotal());
    }
}

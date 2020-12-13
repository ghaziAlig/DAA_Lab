package utilities;
import java.util.*;

public class ItemList {
    ArrayList<Item> items = new ArrayList<>();
    public ItemList(){
        /*
        items.add(new Item('a', 24, 24));
        items.add(new Item('b', 18, 10));
        items.add(new Item('c', 18, 10));
        items.add(new Item('d', 10, 7));
        */

        items.add(new Item('a', 100, 10));
        items.add(new Item('b', 280, 40));
        items.add(new Item('c', 120, 20));

        Collections.sort(items);
    }
    public void printItems(){
        for (Item item : items) {
            System.out.println(item.id + " - " + item.profit+" - " + item.weight);
        }
    }
    public void printSelectedItems(int capacity) {
        ArrayList<Item> selectedItems = new ArrayList<>();
        int selectedWeight=0;
        int totalProfit=0;
        for (Item item : items){
            if(item.weight+selectedWeight<=capacity){
                selectedWeight+=item.weight;
                totalProfit+=item.profit;
                selectedItems.add(item);
            }
        }
        System.out.println("Selected items:");
        for (Item item : selectedItems)
            System.out.print(item.id + " -> ");
    }
}

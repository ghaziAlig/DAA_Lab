package utilities;

public class Item implements Comparable<Item> {
    char id;
    int profit;
    int weight;

    @Override
    public int compareTo(Item otherItem) {
        return otherItem.profit - this.profit;
        //return this.profit - otherItem.profit;
    }

    public Item(char id, int profit, int weight) {
        this.id = id;
        this.weight = weight;
        this.profit = profit;
    }
}

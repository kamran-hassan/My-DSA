import java.util.*;

import javax.xml.catalog.CatalogManager;

public class FractioalKnapsack {
    public static void main(String[] args){
        ArrayList<Item> itemList = new ArrayList<Item>();
        itemList.add(new Item(50,600));
        itemList.add(new Item(20,500));
        itemList.add(new Item(30,400));

        itemList.sort(new MyCmp());
        System.out.println("Total value in Knapsack: " + pickItem(itemList,70));

        //for(Item item : itemList){System.out.println(item.ratio);}

    }

    static int pickItem(ArrayList<Item> itemList, int capacity){
        int value = 0;
        for(int i=0; i<itemList.size(); i++){
            if(itemList.get(i).weight <= capacity){
                System.out.println("Taking full capacity "+itemList.get(i).weight+" and its value is " + itemList.get(i).value);
                value = value + itemList.get(i).value;
                capacity -= itemList.get(i).weight;
            }
            else{
                System.out.println("Taking partial weight "+capacity+" out of "+ itemList.get(i).weight + " and its value is " + ((itemList.get(i).ratio) * capacity));
                value = value + (int)(itemList.get(i).ratio)*capacity;
            }
        }
        return value;
    }
}

class Item{
    int weight;
    int value;
    float ratio;
    // maximize the value in certain weight limit
    Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
        this.ratio = (float)value/(float)weight;
    }
}

class MyCmp implements Comparator<Item> {
    public int compare(Item i1, Item i2) {
        if(i1.ratio - i2.ratio == 0) return 0;
        else if(i1.ratio - i2.ratio > 0) return -1;
        else return 1;
    }
}
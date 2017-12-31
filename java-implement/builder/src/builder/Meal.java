package builder;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class Meal {
    private List<item> items = new ArrayList<item>();

    public void addItem(item e) {
        items.add(e);
    }
    public float getCost(){
        float sum = 0.0f;
        for (item e : items){
            sum += e.price();
        }
        return sum;
    }
    public void showItems(){
        for (item e : items){
            System.out.printf("Item: " + e.name());
            System.out.printf(",Packing: " + e.packing().pack());
            System.out.println(",Price: " + e.price());
        }
    }
}

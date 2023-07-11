import java.util.ArrayList;

public class ShoppingTrolley {

    ArrayList<String> items = new ArrayList<>();

    public ShoppingTrolley() {

    }

    void addItem(String item) {
        this.items.add(item);
    }

    int countItems() {
        return items.size();
    }

    boolean checkItem(String item) {
        return items.contains(item);
    }
}

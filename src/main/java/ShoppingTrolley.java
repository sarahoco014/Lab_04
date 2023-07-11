import java.util.ArrayList;

public class ShoppingTrolley {

    private ArrayList<String> items = new ArrayList<>();

    public ShoppingTrolley() {

    }

    public void addItem(String item) {
        this.items.add(item);
    }

    public int countItems() {
        return items.size();
    }

    public boolean checkItem(String item) {
        return items.contains(item);
    }
}

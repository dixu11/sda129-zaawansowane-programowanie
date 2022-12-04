package advanced.escapeRoom2;

import java.util.ArrayList;
import java.util.List;

//przechowuje przedmioty i daje do nich wygodny dostęp
public class Room {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }
}

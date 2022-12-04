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

    public Item findItemByIndex(int itemIndex) {
        if (itemIndex < 0 || itemIndex >= items.size()) {
            throw new ItemException("Nie znaleziono przedmiotu o takim numerze");
        }
        Item item = items.get(itemIndex);
        return item;
    }
}

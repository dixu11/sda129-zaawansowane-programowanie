package advanced.escapeRoom2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//przechowuje przedmioty i daje do nich wygodny dostęp
public class Room {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public Optional<Item> findItemByIndex(int itemIndex) {
        if (itemIndex < 0 || itemIndex >= items.size()) {
            return Optional.empty();
        }
        Item item = items.get(itemIndex);
        return Optional.of(item);
    }
}


/*
    public Item findItemByIndex(int itemIndex) {
        if (itemIndex < 0 || itemIndex >= items.size()) {
            throw new ItemException("Nie znaleziono przedmiotu o takim numerze");
        }
        Item item = items.get(itemIndex);
        return item;
    }*/

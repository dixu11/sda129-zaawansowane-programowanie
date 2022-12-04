package advanced.escapeRoom2;

import java.util.List;

//przechowuje przedmioty i daje do nich wygodny dostęp
public class Room {

    private List<Object> items;

    public void addItem(Object item) {
        items.add(item);
    }

    public List<Object> getItems() {
        return items;
    }
}

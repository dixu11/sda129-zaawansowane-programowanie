package advanced.escapeRoom2;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

//klasa serwisowa - w niej będą realizowane zasady gry
public class EscapeRoom {

    private Room room = new Room();

    public EscapeRoom() {
        Key key = new Key("Klucz");
        Window window = new Window("Okno");
        Door door = new Door("Drzwi");
        room.addItem(key);
        room.addItem(window);
        room.addItem(door);
    }

    public List<Item> getItems() {
        return room.getItems();
    }

    public void useItem(int itemIndex) {
        Item item = room.findItemByIndex(itemIndex)
                .orElseThrow(()->  new ItemException("Nie znaleziono przedmiotu o takim numerze"));
        System.out.println("dopasowano do przedmiotu: " + item.getName());
    }

}

/*
    public void useItem(int itemIndex) {
        Optional<Item> optional = room.findItemByIndex(itemIndex);
        if (optional.isEmpty()) {
            throw new ItemException("Nie znaleziono przedmiotu o takim numerze");
        }else{
            Item item = optional.get();
            System.out.println("dopasowano do przedmiotu: " + item.getName());
        }
    }
*/

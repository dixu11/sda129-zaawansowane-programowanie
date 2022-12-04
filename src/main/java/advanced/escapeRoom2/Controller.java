package advanced.escapeRoom2;

import java.util.List;

//klasa odpowiedzialna za interakcje z grą
public class Controller {

    void printMenu() {
        System.out.println("Dostępne przedmioty:");
        EscapeRoom escapeRoom = new EscapeRoom();
        List<Item> items = escapeRoom.getItems();
        for (Item item : items) {
            System.out.println(item.getName());
        }
        //dostać przedmioty z pokoju
        /*System.out.println("1. Klucz");
        System.out.println("2. Okno");
        System.out.println("3. Drzwi");*/
    }

}

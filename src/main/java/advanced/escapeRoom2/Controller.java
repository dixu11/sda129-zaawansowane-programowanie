package advanced.escapeRoom2;

import java.util.List;
import java.util.Scanner;

//klasa odpowiedzialna za interakcje z grą
public class Controller {

    void printMenu() {
        System.out.println("Dostępne przedmioty:");
        EscapeRoom escapeRoom = new EscapeRoom();
        List<Item> items = escapeRoom.getItems();
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            System.out.printf("%d. %s\n", i + 1, item.getName());
        }
    }

    int readNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wpisz numer przedmiotu: ");
        return scanner.nextInt();
    }

    void useItem(int itemNr) {
        System.out.println("wybrano " + itemNr);
        EscapeRoom escapeRoom = new EscapeRoom();
        escapeRoom.useItem(itemNr-1);
    }

}

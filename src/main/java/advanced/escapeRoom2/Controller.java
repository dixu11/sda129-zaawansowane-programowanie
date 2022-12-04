package advanced.escapeRoom2;

import java.util.List;
import java.util.Scanner;

//klasa odpowiedzialna za interakcje z grą
public class Controller {


    public void start() {
        do {
            try {
                printMenu();
                int itemNr = readNumber();
                useItem(itemNr);
            } catch (ItemException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    private void printMenu() {
        System.out.println("Dostępne przedmioty:");
        EscapeRoom escapeRoom = new EscapeRoom();
        List<Item> items = escapeRoom.getItems();
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            System.out.printf("%d. %s\n", i + 1, item.getName());
        }
    }

    private int readNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wpisz numer przedmiotu: ");
        return scanner.nextInt();
    }

    private void useItem(int itemNr) {
        System.out.println("wybrano " + itemNr);
        EscapeRoom escapeRoom = new EscapeRoom();
        escapeRoom.useItem(itemNr - 1);
    }

}

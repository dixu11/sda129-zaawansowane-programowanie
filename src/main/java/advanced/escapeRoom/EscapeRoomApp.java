package advanced.escapeRoom;

import java.util.Scanner;

public class EscapeRoomApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Your are in a room there are two objects: door and window - chose one");
        String[] choices = {"door", "window"};
        for (String chose : choices) {
            System.out.println(chose);
        }
        String firstChoice = scan.nextLine();
        switch (firstChoice) {
            case "door":
                System.out.println("doors are locked!");
                return;
            case "window":
                System.out.println("You open a widow, there is a Key on a windowsill!");

                System.out.println("What you do know?");
                String[] choices2 = {"Use Key on a door", "close the window"};
                for (String chose : choices2) {
                    System.out.println(chose);
                }
                String secondChoice = scan.nextLine();
                switch (secondChoice) {
                    case "Use Key on a door":
                        System.out.println("Doors are open! Good job you escaped!");
                        break;
                    case "close the window":
                        System.out.println("you are clumsy, you fall down and you broke a leg!");
                        break;

                }
        }
    }
}


package advanced.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsDemo {

    public static void main(String[] args) {

    }

    public static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę 1-10");
        try {
            int inputNumber = scanner.nextInt();
            System.out.printf("Twoja liczba:%d\n", inputNumber);
        } catch (InputMismatchException e) {
            System.out.println("Baranie, podaj liczbę");
            String test = null;
            System.out.println(test.charAt(0));
        }finally {
            System.out.println("To zawsze się wykona");
        }
    }


}

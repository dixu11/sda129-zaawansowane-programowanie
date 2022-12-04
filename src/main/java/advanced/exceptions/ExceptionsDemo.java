package advanced.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsDemo {

    public static void main(String[] args) {
        int inputNumber = readNumber();
        System.out.printf("Twoja liczba:%d\n", inputNumber);
    }

    public static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę 1-10");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Baranie, podaj liczbę");
            //String test = null;
            //System.out.println(test.charAt(0));
            return -1;
        }finally {
            System.out.println("To zawsze się wykona");
        }
    }


}

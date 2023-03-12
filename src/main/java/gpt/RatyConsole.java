package gpt;

import java.util.Scanner;

public class RatyConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobieranie ceny towaru
        System.out.print("Podaj cenę towaru (od 100 zł do 10 tys. zł): ");
        double cena = scanner.nextDouble();
        if (cena < 100 || cena > 10000) {
            System.out.println("Błędna cena towaru!");
            return;
        }

        // Pobieranie liczby rat
        System.out.print("Podaj liczbę rat (od 6 do 48): ");
        int liczbaRat = scanner.nextInt();
        if (liczbaRat < 6 || liczbaRat > 48) {
            System.out.println("Błędna liczba rat!");
            return;
        }

        // Wyliczenie oprocentowania
        double oprocentowanie;
        if (liczbaRat >= 6 && liczbaRat <= 12) {
            oprocentowanie = 0.025;
        } else if (liczbaRat >= 13 && liczbaRat <= 24) {
            oprocentowanie = 0.05;
        } else {
            oprocentowanie = 0.1;
        }

        // Obliczenie miesięcznej raty
        double oplata = cena * oprocentowanie;
        double rata = (cena + oplata) / liczbaRat;

        // Wyświetlenie wyniku
        System.out.printf("Miesięczna rata wynosi: %.2f zł%n", rata);
    }
}

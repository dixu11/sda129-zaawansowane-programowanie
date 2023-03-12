package gpt;

import java.util.Scanner;

public class RatyObiektowo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SklepAGD sklep = new SklepAGD();

        System.out.print("Podaj cenę towaru (od 100 zł do 10 tys. zł): ");
        double cena = scanner.nextDouble();
        if (cena < 100 || cena > 10000) {
            System.out.println("Błędna cena towaru!");
            scanner.close();
            return;
        }

        System.out.print("Podaj liczbę rat (od 6 do 48): ");
        int liczbaRat = scanner.nextInt();
        if (liczbaRat < 6 || liczbaRat > 48) {
            System.out.println("Błędna liczba rat!");
            scanner.close();
            return;
        }

        double rata = sklep.obliczMiesiecznaRate(cena, liczbaRat);

        System.out.printf("Miesięczna rata wynosi: %.2f zł%n", rata);

        scanner.close();
    }

}

class SklepAGD {

    private double oprocentowanie;

    public SklepAGD() {
    }

    public double obliczOprocentowanie(int liczbaRat) {
        if (liczbaRat >= 6 && liczbaRat <= 12) {
            oprocentowanie = 0.025;
        } else if (liczbaRat >= 13 && liczbaRat <= 24) {
            oprocentowanie = 0.05;
        } else {
            oprocentowanie = 0.1;
        }
        return oprocentowanie;
    }

    public double obliczMiesiecznaRate(double cena, int liczbaRat) {
        double oplata = cena * obliczOprocentowanie(liczbaRat);
        return (cena + oplata) / liczbaRat;
    }
}

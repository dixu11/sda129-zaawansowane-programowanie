package gpt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RatyObiektowoTest {

    @Test
    public void testObliczMiesiecznaRate1() {
        SklepAGD sklep = new SklepAGD();
        double cena = 1000.0;
        int liczbaRat = 12;
        double expected = 89.02;
        double result = sklep.obliczMiesiecznaRate(cena, liczbaRat);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testObliczMiesiecznaRate2() {
        SklepAGD sklep = new SklepAGD();
        double cena = 5000.0;
        int liczbaRat = 24;
        double expected = 235.99;
        double result = sklep.obliczMiesiecznaRate(cena, liczbaRat);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testObliczMiesiecznaRate3() {
        SklepAGD sklep = new SklepAGD();
        double cena = 8000.0;
        int liczbaRat = 48;
        double expected = 228.89;
        double result = sklep.obliczMiesiecznaRate(cena, liczbaRat);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void testObliczOprocentowanie1() {
        SklepAGD sklep = new SklepAGD();
        int liczbaRat = 10;
        double expected = 0.025;
        double result = sklep.obliczOprocentowanie(liczbaRat);
        assertEquals(expected, result, 0.0001);
    }

    @Test
    public void testObliczOprocentowanie2() {
        SklepAGD sklep = new SklepAGD();
        int liczbaRat = 20;
        double expected = 0.05;
        double result = sklep.obliczOprocentowanie(liczbaRat);
        assertEquals(expected, result, 0.0001);
    }

    @Test
    public void testObliczOprocentowanie3() {
        SklepAGD sklep = new SklepAGD();
        int liczbaRat = 36;
        double expected = 0.1;
        double result = sklep.obliczOprocentowanie(liczbaRat);
        assertEquals(expected, result, 0.0001);
    }
}

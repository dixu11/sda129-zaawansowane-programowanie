package composition.forest;

import java.util.Random;

public class Tree {

    private int lengthInMeters;
    private double irrigation;
    private double condition;
    private Object animal;

    public Tree() {
        lengthInMeters = 0;
        irrigation = 1.0;
        condition = 1.0;
        animal = null;
    }

    public void movesOneYearForward() {
        lengthInMeters++;
        irrigation -= 0.1;
        condition -= 0.01;
    }


    @Override
    public String toString() {
        return "Tree{" +
                "lengthInMeters=" + lengthInMeters +
                ", irrigation=" + irrigation +
                ", condition=" + condition +
                ", animal=" + animal +
                '}';
    }
}


/*
 * drzewo jest w lesie
 * zwierzeta tez sa w lesie
 * w drzewie zamieszkuje zwierze
 * las się zmienia - wpływa na ilość, rodzaj i zachowanie zwierzat i drzew
 * pośrednio np poprzez pogode
 * z lasem interakcje maja ludzie, mogą np wyciąć las albo polować na zwierzęta
 *
 * nasza aplikacja będzie symulować zmiany w lesie
 *  spowodowane upływem czasu i zdarzeniami np wycinka
 * */

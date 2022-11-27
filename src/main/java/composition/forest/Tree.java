package composition.forest;

import java.util.Random;

public class Tree {

    private int lengthInMeters;
    private double irrigation;
    private double condition;
    private Animal animal;
    //todo age

    public Tree() {
        lengthInMeters = 0;
        irrigation = 1.0;
        condition = 1.0;
        animal = null;
    }

    public void movesOneYearForward() {

        //jeśli jest jakieś zwierze to uwzględnij jego wpływ na condition
        considerTimeInfluence();


        considerAnimalInfluence();
    }

    private void considerTimeInfluence() {
        lengthInMeters++;
        irrigation -= 0.1;
        condition -= 0.01;
    }




    private void considerAnimalInfluence() {
        if (animal == null) {
            return;
        }
        condition += animal.getImpactOnTree();
    }

    //wstaw wskazane zwierze do tego drzewa, jeśli drzewo jest już zamieszkane, nic nie rób
    public void inputAnimal( Animal newAnimal ) {
        if (animal == null) {
            animal = newAnimal;
        }
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

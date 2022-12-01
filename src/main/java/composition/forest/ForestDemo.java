package composition.forest;

import java.math.BigDecimal;

public class ForestDemo {
    public static void main(String[] args) {

        /*System.out.println(-0.05 + 0.15);
        BigDecimal bd1 = BigDecimal.valueOf(-0.05);
        BigDecimal bd2 = BigDecimal.valueOf(0.15);
        BigDecimal bd3=  bd1.add(bd2);
        System.out.println(bd3);*/

        Tree tree = new Tree();
        Tree tree2 = new Tree();
        Tree tree3 = new Tree();

        System.out.println(tree);
        System.out.println(tree2);
        System.out.println(tree3);

        tree.movesOneYearForward();
        tree.movesOneYearForward();
        tree2.movesOneYearForward();

        System.out.println(tree);
        System.out.println(tree2);
        System.out.println(tree3);

        Animal animal = new Animal(AnimalType.OMNIVOROUS, Species.SQUIRREL);
        Animal animal2 = new Animal(AnimalType.CARNIVOROUS, Species.WOODPECKER);
        Animal animal3 = new Animal(AnimalType.HERBIVORES, Species.MONKEY);

        System.out.println(animal);
        System.out.println(animal2);
        System.out.println(animal3);


        tree.inputAnimal(animal);
        tree2.inputAnimal(animal2);
        tree.inputAnimal(animal3);

        System.out.println(tree); //malpa
        System.out.println(tree2); //woodpeker
        System.out.println(tree3); //nic

        System.out.println("Ostateczna symulacja drzew ze zwierzętami, które mają na nie wpływ");
        tree3.inputAnimal(animal3); // do ostatniego drzewa podrzucamy złośliwą małpę

        tree.movesOneYearForward();
        tree.movesOneYearForward();
        tree2.movesOneYearForward();
        tree2.movesOneYearForward();
        tree3.movesOneYearForward();
        tree3.movesOneYearForward();

        System.out.println(tree);
        System.out.println(tree2);
        System.out.println(tree3);
    }
}

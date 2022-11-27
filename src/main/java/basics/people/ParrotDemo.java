package basics.people;

import java.util.Random;

public class ParrotDemo {

    public static void main(String[] args) {
        int number = 10;
        String text = new String("abc");
        int[] numbers = {1, 2, 3};
        int[] numbers2 = new int[]{1, 2, 3};
        Object object = numbers;

        Random random = new Random();
        System.out.println(numbers.toString());


        Parrot parrot = new Parrot();
        parrot.name = "Gustaw";
        parrot.chanceToRemember = 0.4;
        parrot.maxWordsCount = 3;

        Parrot parrot2 = new Parrot();
        parrot2.name = "Bożydar";
        parrot2.chanceToRemember = 0.8;
        parrot2.maxWordsCount = 4;


        parrot.sayHi();
       /* System.out.println(parrot.name);
        System.out.println(parrot.chanceToRemember);
        System.out.println(parrot.maxWordsCount);*/

        parrot2.sayHi();
        /*System.out.println(parrot2.name);
        System.out.println(parrot2.chanceToRemember);
        System.out.println(parrot2.maxWordsCount);*/

        System.out.println(parrot);
        System.out.println(parrot2);






    }

}

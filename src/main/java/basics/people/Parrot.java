package basics.people;

import java.util.ArrayList;
import java.util.List;

public class Parrot {

   private String name;
   private List<String> knownWords;
   private double chanceToRemember;
   private int maxWordsCount;

/*    public Parrot(String initialName,double iniChance,int iniMaxWords) {
        name = initialName;
        chanceToRemember = iniChance;
        maxWordsCount = iniMaxWords;
    }*/

    public Parrot(String name, double chanceToRemember, int maxWordsCount) {
        this.name = name;
        this.chanceToRemember = chanceToRemember;
        this.maxWordsCount = maxWordsCount;
        knownWords = new ArrayList<>();
    }

    public Parrot() {
        name = "Polly";
        chanceToRemember = 0.5;
        maxWordsCount = 10;
        knownWords = new ArrayList<>();
    }

    public void sayHi() {
        System.out.println("Cześć jestem " +name);
        System.out.println("Znam słowa:" + knownWords);
        System.out.println("Uczę się ze skutecznością: " + chanceToRemember);
        System.out.println("Mogę znać max: " + maxWordsCount);
    }

    public void learnNewWord(String newWord) {
        knownWords.add(newWord);
    }


    @Override
    public String toString() {
        return "to String zmieniony!";
    }


}

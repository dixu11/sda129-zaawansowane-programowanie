package basics.people;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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


    public void tellMeSomething() {
        if (knownWords.isEmpty()) {
            System.out.println(name + " don't know any words :(");
            return;
        }
        String story = "";
        Random random = new Random();
        int wordsInStory = random.nextInt(10) + 1;
        for (int i = 0; i < wordsInStory; i++) {
            story += knownWords.get(random.nextInt(knownWords.size()));
            story += " ";
        }
        story += ".";
        System.out.println(story);
    }

    @Override
    public String toString() {
        return "to String zmieniony!";
    }


}

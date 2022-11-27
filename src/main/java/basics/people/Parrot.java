package basics.people;

import java.util.ArrayList;
import java.util.List;

public class Parrot {

    String name;
    List<String> knownWords = new ArrayList<>();
    double chanceToRemember;
    int maxWordsCount;

    public void sayHi() {
        System.out.println("Cześć jestem " +name);
        System.out.println("Znam słowa:" + knownWords);
        System.out.println("Uczę się ze skutecznością: " + chanceToRemember);
        System.out.println("Mogę znać max: " + maxWordsCount);
    }

}

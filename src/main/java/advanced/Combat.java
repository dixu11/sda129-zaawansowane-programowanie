package advanced;


public class Combat {



    public int whoWin(Card card1, Card card2) {
        if (card1.getStrength() > card2.getStrength()) {
            System.out.println("Wygrywa " + card1);
            return -1;
        } else if (card1.getStrength() == card2.getStrength()) {
            System.out.println("Wojna!");
            return 0;
        } else {
            System.out.println("Wygrywa " + card2);
            return 1;
        }
    }


}

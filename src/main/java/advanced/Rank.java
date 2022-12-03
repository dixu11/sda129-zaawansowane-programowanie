package advanced;

public enum Rank {
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13),
    ACE(14);

    //cechy
    private int strength;

    //konstruktory
   Rank(int strength) {
        this.strength = strength;
    }


    //zachowania
    public int getStrength() {
        return strength;
    }
}

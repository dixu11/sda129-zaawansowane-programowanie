package advanced;

public class Card {

   private final Rank rank;
   private final Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getStrength() {
       return rank.getStrength();
    }

    @Override
    public String toString() {
        return rank + " " + suit;
    }

}





 /*   Stwórz obiekt typu Karta (Card). Kartę będą opisywać
 dwa pola klas enumowych Rank(Ranga np. dziewiątka, as) oraz
  Suit (Kolor - np. pik).
        Stwórz dwie dowolne karty w mainie, różniące się rangą
         i kolorem, zaprezentuj je wykorzystując nadpisaną
         metodę toString.
        W mainie wyświetl wszystkie możliwe rangi
         wykorzystując statyczną metodę enumów - values().
        Każda z rang ma mieć przypisaną siłę, dla dwójki 2,
         trójki 3 itd.
        Obiekty kart mają mieć metodę pozwalającą na pobranie
         siły karty.
        Stwórz dodatkowa klase z metoda pozwalająca porównać
        dwie karty, drukujący tą która jest większa.
        Stwórz listę wszystkich możliwych kart w kolorze pik.
         (wykorzystaj pętle dla automatyzacji zadania)
        Stwórz całą talię, czyli listę wszystkich możliwych
        kart dla wszystkich możliwych kolorów i rang.
*/
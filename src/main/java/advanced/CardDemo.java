package advanced;

import java.util.ArrayList;
import java.util.List;

public class CardDemo {
    public static void main(String[] args) {
        Card card = new Card(Rank.ACE, Suit.HEARTS);
        Card card2 = new Card(Rank.NINE, Suit.SPADES);
        Card card3 = new Card(Rank.KING, Suit.CLUBS);
        System.out.println(card);
        System.out.println(card2);
        System.out.println(card3);
       // Rank rank = new Rank();


        Rank[] ranks = Rank.values();
        for (Rank rank : ranks) {
            System.out.println(rank);
        }

        System.out.println(card.getStrength());
        System.out.println(card2.getStrength());

        Combat combat = new Combat();
        combat.whoWin(card,card2); //nine vs ace
        combat.whoWin(card, card3); // ace vs king


        List<Card> cards = new ArrayList<>();
        for(Suit suit : Suit.values()) {
            for (Rank rank : ranks) {
                Card newCard = new Card(rank, suit);
                cards.add(newCard);
            }
        }
        System.out.println(cards);
    }
}



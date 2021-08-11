package lesson15;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class CardsByTeacher {

    enum Suits {
        Hearts,
        Spades,
        Diamonds,
        Clubs
    }

    enum CardValues {
        Two,
        Three,
        Four,
        Five,
        Six,
        Seven,
        Eight,
        Nine,
        Ten,
        Jack,
        Queen,
        King,
        Ace
    }

    public static void main(String[] args) {

        String[] cardDeck = new String[52];
        int counter = 0;

        for (int i = 0; i < Suits.values().length; i++) {
            for (int j = 0; j < CardValues.values().length; j++) {
                cardDeck[counter] = String.format("%s %s", Suits.values()[i], CardValues.values()[j]);
                counter++;
                System.out.println(cardDeck[counter - 1]);
            }
        }

        // SHUFFLE THE DECK SIMPLE
        // SHUFFLE
        // Select one random card
        // It will return a value between [0...1]
        String randomCard = cardDeck[(int) (Math.random() * 51d)];
        System.out.println("We got a Random first Card: " + randomCard);

        System.out.println();

        Random randomGenerator = ThreadLocalRandom.current();
        for (int i = cardDeck.length - 1; i > 0; i--) {
            int index = randomGenerator.nextInt(i + 1);
            // Simple swap
            String a = cardDeck[index];
            cardDeck[index] = cardDeck[i];
            cardDeck[i] = a;
        }

        for (int i = 0; i < 6; i++) {
            String randomCardSix = cardDeck[(int) (Math.random() * 51d)];
            System.out.println("We got one out of six REALLY SHUFFLED CARDS: " + cardDeck[i]);

        }
    }
}

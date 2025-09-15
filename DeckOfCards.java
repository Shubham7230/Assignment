import java.util.Scanner;

public class DeckOfCards {
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", 
                         "Jack", "Queen", "King", "Ace"};
        
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index] = rank + " of " + suit;
                index++;
            }
        }
        return deck;
    }
    
    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int)(Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }
    
    public static String[][] distributeCards(String[] deck, int players, int cardsPerPlayer) {
        if (players * cardsPerPlayer > deck.length) {
            System.out.println("Not enough cards!");
            return null;
        }
        
        String[][] result = new String[players][cardsPerPlayer];
        int cardIndex = 0;
        
        for (int player = 0; player < players; player++) {
            for (int card = 0; card < cardsPerPlayer; card++) {
                result[player][card] = deck[cardIndex++];
            }
        }
        return result;
    }
    
    public static void printPlayersCards(String[][] playersCards) {
        for (int i = 0; i < playersCards.length; i++) {
            System.out.println("Player " + (i+1) + " cards:");
            for (String card : playersCards[i]) {
                System.out.println("  " + card);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of players: ");
        int players = scanner.nextInt();
        System.out.print("Enter cards per player: ");
        int cardsPerPlayer = scanner.nextInt();
        
        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);
        String[][] playersCards = distributeCards(deck, players, cardsPerPlayer);
        
        if (playersCards != null) {
            printPlayersCards(playersCards);
        }
    }
}
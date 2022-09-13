public class DeckOfCards {

    public Card[] returnDeck(){
        Card[] cards = new Card[52];
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        char[] suits = {'H', 'S', 'D','C'};

        int count = 0;
        for (int i = 0; i < suits.length; i++){
            for (int x = 0; x < ranks.length; x++){
                cards[count] = new Card(ranks[x], suits[i]);
                count++;
            }
        }
        return cards;
    }
}

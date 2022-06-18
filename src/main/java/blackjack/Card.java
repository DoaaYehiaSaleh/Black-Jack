
package blackjack;


public class Card {
    private final int suit ;
    private final int rank;
    private final int value;
    
      public Card(int suit , int rank, int value){
          this.suit = suit;
          this.value = value;
          this.rank = rank;
      }
      public Card (Card s ){
          suit = s.suit;
          value = s.value;
          rank = s.rank;
      }
    public int getSuit() {
        return this.suit;
    }

    public int getRank() {
        return this.rank;
    }

    public int getValue() {
        return this.value;
    }

  
    
}

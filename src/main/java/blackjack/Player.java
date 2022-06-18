
package blackjack;
public class Player {
     private String Name;
     private int score;
     private Card [] Cards = new Card [11];
     int counter=0;
     

    public Player(String Name , int score  ) {
        this.Name = Name;
        this.score = score;
        
        
    }
   
    public String getName() {
        return Name;
    }


    public int getScore() {
        return score;
    }

    public Card[] getCards() {
        return Cards;
    }

    public void addCards(Card C) {   
        Cards[counter]=new Card(C);
        counter++;
        score+= C.getValue();
    }
 
}

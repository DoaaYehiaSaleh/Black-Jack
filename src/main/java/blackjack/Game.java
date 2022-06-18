
package blackjack;
import java.util.Random ;
import java.util.Scanner ;
public class Game {
     Player players [] = new Player [4]; 
     Card [] Deck = new  Card[54];
     int highscore ;
     int counter=0;
     
     public void generateCards(){
         for (int i =0; i < 4; i++){
             for (int j = 0; j < 13; j++){
                 if (j==0){
                      
                      Deck [counter]=new Card(i,j,1);
                       
                 }
                  else if (j>=10){
                      Deck [counter] =new Card(i,j,10);   
                           
                          }
                  else {
                      Deck [counter] =new Card(i,j,j+1);   
                          
                  }
                 counter++;
             }
              
         }}
      
       public Card draw_Card (){           
           
       Random rand = new Random ();      
       int randomChoice = rand.nextInt(52);
       Card randomCard = Deck[randomChoice];
       
            while (randomCard==null){
                
              randomChoice = rand.nextInt(52);
              randomCard = Deck[randomChoice];
                
           }
            randomCard = new Card(Deck[randomChoice]);
            Deck [randomChoice] = null;
             return randomCard;
     }
                  
          public void playerInfo ( ){
              Scanner N = new Scanner(System.in);
               String name="";
              for (int i = 0; i<4; i++){
                  if (i!=3){
                  System.out.println(" Enter name of player :");
                   name = N.next();
                  }
                  else 
                  { name ="dealer";
                  }
                  players [i]=new Player (name,0);
              for (int j = 0; j<2; j++){
                  Card X = draw_Card ();
                  players [i].addCards(X);
              }  
           
              }
              
           
           
}
          public void maxUpdate (){
              for (int i =0; i<4; i++)
              if (players[i].getScore()>highscore ){
              if(players[i].getScore()<=21){
                  highscore = players[i].getScore();
              }                  
              }
          }
}              
      



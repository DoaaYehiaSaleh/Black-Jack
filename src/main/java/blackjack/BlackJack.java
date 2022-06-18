
package blackjack;

import java.util.Scanner ;
public class BlackJack {
     static Game game =new Game();
    public static void main (String []arg){
         
       GUI gui = new GUI();
       game.generateCards();
       game.playerInfo();
       
         
       gui.runGUI( game.Deck, game.players[0].getCards(),game.players[1].getCards(),game.players[2].getCards(),game.players[3].getCards() );
               
        
              Scanner scanner = new Scanner(System.in);
             
              
         for (int i=0; i<3; i++){
              System.out.println("Please choose Hit or Stand");
              String input = "";
              input = scanner.nextLine();
                while (input.toLowerCase().equals("Hit")){
                    
                   Card card= game.draw_Card();
                   game.players[i].addCards(card);            
                   gui.updatePlayerHand(card, i);
                   
                    if (game.players[i].getScore()>=21){
                        break;
                    }
                    if (input.toLowerCase().equals("Stand")){
                        break;
                    }
                    game.maxUpdate();
                }
                
                }
         
         while (game.players[3].getScore()< game.highscore ){
             Card card= game.draw_Card();
                   game.players[3].addCards(card);            
                   gui.updateDealerHand(card,game.Deck);
         }     
         
         }
    public void Check(){
        int highScore = 0;
        int winner =-1;
        for (int i =0 ; i<4 ; i++){
            if (game.highscore >highScore ){
                highScore = game.highscore;
                winner = i;
              if (winner >=0){
                System.out.println("The winner is "+ game.players[i]+"Score"+highScore);
             }  
            }
        
        }
    }
         }
            
               
       
    


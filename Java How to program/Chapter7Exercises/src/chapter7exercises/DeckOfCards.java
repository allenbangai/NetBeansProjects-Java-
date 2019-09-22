/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7exercises;
import java.security.SecureRandom;
/**
 *
 * @author DELL
 */
public class DeckOfCards {
    private Card[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARD = 52;
    
    private static final SecureRandom secureRandom = new SecureRandom();
    
    public DeckOfCards(){
        String[] face = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
        
        String[] suit = {"Hearts", "Diamonds", "Clubs", "Spades"};
        
        deck = new Card[NUMBER_OF_CARD];
        currentCard = 0;
        
        //populTE DECK WITH CARDS OBJECTS
        for(int count = 0; count < deck.length; count++){
            //
            deck[count] = new Card(face[count%13], suit[count/13]);

        }
    }
    
    public void shuffle(){
        // next call to method dealCard should start at deck[0] again
        currentCard = 0;
        
        for(int first = 0; first < deck.length; first++){
            //select a random number betweeen O and 51;
            int second = secureRandom.nextInt(NUMBER_OF_CARD);
            // swap current Card with randomly selected Card
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;        
        }
    }
    
    //DEAL WITH ONE CARD
    public Card dealCard(){
        if(currentCard < deck.length){
            return deck[currentCard++];
        }
        else{
            return null;
        }
    }
}
    //end of class

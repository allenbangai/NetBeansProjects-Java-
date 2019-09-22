/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7exercises;

/**
 *
 * @author DELL
 */
public class DeckOCardsImplementation {
    public static void main(String[] args){
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.shuffle();//place a card in random other
        
        // print all 52 cads in the other in which they are dealt
        for(int i=1; i<=52; i++){
            //deal and display card
            System.out.printf("%-19s", deckOfCards.dealCard());
            if(i%4 == 0){
                System.out.println();
            }    
        }
    }
}//end clas DeckOfCardsImplementation

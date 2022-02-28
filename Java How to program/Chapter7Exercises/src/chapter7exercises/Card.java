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
public class Card {
    private final String face; // face of card ("Ace", "Deuce", ...)
    private final String suit; // suit of card ("Hearts", "Diamonds", ...)

    // two-argument constructor initializes card's face and suit
    public Card(String CardFace, String CardSuit){
        this.face = CardFace; // initialize face of card
        this.suit = CardSuit; // initialize suit of card
    } 
    // return String representation of Card
    @Override
    public String toString(){
        return face + " of " + suit;
    }
}// end class Card

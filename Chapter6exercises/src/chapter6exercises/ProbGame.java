/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6exercises;
import java.security.SecureRandom;
/**
 *
 * @author DELL
 */
public class ProbGame {
    //creat secured number random genrator for use
    private static final SecureRandom randomnumbers = new SecureRandom();
    //enum type with constant that represent the game status
    private enum STATUS{CONTINUE, WON, LOST};
    
    private static final int two_throw = 2;
    private static final int three_throw =3;
    private static final int seven_throw = 7;
    private static final int eleven_throw = 11;
    private static final int box_cards = 12;
    
    //plays onl game of probgame
    public static void main(String[] args){
        int pointnum = 0;
        STATUS gamestatus;//can contain CONTINUE, ,WON OR LOST
         
        int sumofnum = rolldice();
        
        //determine the game status and point based on the first roll
        switch(sumofnum){
            case seven_throw://win with 7 on first roll
            case eleven_throw://win with 11 on first roll
                gamestatus = STATUS.WON;
                break;
            case two_throw://lose
            case three_throw://lose
            case box_cards://lose with 12 on first roll
                gamestatus = STATUS.LOST;
                break;
            default://did not win or lose, remember point
                gamestatus = STATUS.CONTINUE; //game is not over
                pointnum = sumofnum;                
        }
        //while game is not complete
        while(gamestatus == STATUS.CONTINUE){
            sumofnum = rolldice();//roll dice again
            
            //determine the game status
            if(sumofnum == pointnum){
                gamestatus = STATUS.WON;
            }
            else{ 
                if(sumofnum == seven_throw){
                    gamestatus=STATUS.LOST;   
                }
            }
        }
        //display lost or won message
        if(gamestatus==STATUS.WON){
            System.out.println("Player Wins");
        }
        else{
            System.out.println("Player Loses");
        }
    }
    
    //roll dice, calculate the sum and display result
    public static int rolldice(){
        //pick random die value
        int die1 = 1 + randomnumbers.nextInt(6);//roll first die
        int die2 = 1 + randomnumbers.nextInt(6);//roll second die
        int sum = die1 + die2;//sum of value of fist and second die
        
        //display result of each roll
        System.out.printf("player rolled %d and %d = %d%n",die1,die2,sum);
        return sum;
    }
}

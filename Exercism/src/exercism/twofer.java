/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercism;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class twofer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner allen = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 1 if you wish to imput a name");
        int num1 = allen.nextInt();
        //String str1 = allen.nextLine();
        switch(num1){
            case 1:
                String str1 = input.nextLine();
                System.out.println("One for "+str1+", one for me");
                System.out.print(str1);
                break;
            default:
                System.out.println("One for you, one for me");
                break;
        }
    }    
}

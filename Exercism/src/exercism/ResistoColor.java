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
public class ResistoColor {
    public static void main(String[] args){
        Scanner integer = new Scanner(System.in);
        Scanner string = new Scanner(System.in);
        Scanner allenbangai = new Scanner(System.in);
        
        //get user to input requiired imformation to calculate resistans from color bands
        int i, j, k, n, m;
        String[] colors = {};
        System.out.print("Enter the number of colors the resistor have");
        int numberOfColors = integer.nextInt();//entering the number of colors
        
        System.out.print("\nEnter the colors name in oder");
        for(i=1; i<=numberOfColors; i++){
            colors[i] = string.next();
        }
        
        int[] number = new int[numberOfColors];
        //assigning each color a number
        for(j=1; j<=numberOfColors; j++){
            if("Black".equals(colors[j])&&"||".equals(colors[j])){
                number[j]=1;
            }
            else if("Brown".equals(colors[j])||"brown".equals(colors[j])){
                
            }
            else if("Red".equals(colors[j])||"red".equals(colors[j])){
                
            }
            else if("Orange".equals(colors[j])||"orange".equals(colors[j])){
                
            }
            else if("Yellow".equals(colors[j])||"yellow".equals(colors[j])){
                
            }
            else if("Green".equals(colors[j])||"green".equals(colors[j])){
                
            }
            else if("Blue".equals(colors[j])||"blue".equals(colors[j])){
                
            }
            else if("Violet".equals(colors[j])||"violet".equals(colors[j])){
                
            }
            else if("Grey".equals(colors[j])||"grey".equals(colors[j])){
                
            }
            else if("White".equals(colors[j])||"white".equals(colors[j])){
                
            }
        }
        
    }
}
/*Black: 0
- Brown: 1
- Red: 2
- Orange: 3
- Yellow: 4
- Green: 5
- Blue: 6
- Violet: 7
- Grey: 8
- White: 9*/
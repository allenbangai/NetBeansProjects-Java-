/*
 */
package guichapterex01;

import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;
/**
 *
 * @author DELL
 */
public class ImpDrawRandOvals extends JPanel{
    //creating a secure random object
    //SecureRandom randomnum = new SecureRandom();
    
    public void Component(Graphics allen){
        super.paintComponent(allen);
        System.out.printf("Hello");
        //creating and intialising a random variable so that it can varry diff. drawings
        int num1 = 1;// + randomnum.nextInt(2);
        System.out.println(num1);
        if(num1==1){
            //variables for drawing the cirles filled with colors
            int m=250, n=100, i=0, j=0;            
            //variables for the constructor costumcolors of Colors(RGB)
            int r=10, g=50, b=255;            
            //loop for drawing the circles with varying and colors. 
            while(j<20){
            	//creating the costom color RGB but passing a color constructor
                Color customcolor = new Color(r, g, b);
                //setting custom colors
                allen.setColor(customcolor);
                //drawing the Ovals in which the colors will be set in
                allen.fillOval(m, m, n, n);
                //the algorithm below helps you vary the colors(intensity) and draw the different circles
                r=10; g=255; b=50;
                m=m-10;
                n=n+20;
                i++;
                j++;
                //if you look into this, you will understand
                if(i==2){
                    r=10; g=50; b=255;
                    i=0;
                }                
                else{
                }
            }            
        }
        else{
            //variables for drawing the cirles filled with colors
            int m=250, n=100, i=0, j=0;            
            //variables for the constructor costumcolors of Colors(RGB)
            int r=10, g=5, b=5;            
            //loop for drawing the circles with varying and colors. 
            while(j<20){
            	//creating the costom color RGB but passing a color constructor
                Color customcolor = new Color(r, g, b);
                //setting custom colors
                allen.setColor(customcolor);
                //drawing the Ovals in which the colors will be set in
                allen.fillOval(m, m, n, n);
                //the algorithm below helps you vary the colors(intensity) and draw the different circles
                r=255; g=25; b=50;
                m=m-10;
                n=n+20;
                i++;
                j++;
                //if you look into this, you will understand
                if(i==2){
                    r=10; g=5; b=5;
                    i=0;
                }                
                else{
                }
            }      
        }
    }
    
}
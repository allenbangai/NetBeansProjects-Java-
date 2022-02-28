/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guichapter8;
import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;
/**
 *
 * @author DELL
 */
public class DrawPanel extends JPanel{
    public SecureRandom randomNumbers = new SecureRandom();
    public MyLine[] lines; // array of lines
    
    //constructor, create a panel with random shapes
    public DrawPanel(){
        setBackground(Color.WHITE);
        
        lines = new MyLine[5 + randomNumbers.nextInt(5)];
        
        //create lines
        for(int count =1; count<=lines.length; count++){
            //generate random coordinates
            int x1 = randomNumbers.nextInt(300);
            int y1 = randomNumbers.nextInt(300);
            int x2 = randomNumbers.nextInt(300);
            int y2 = randomNumbers.nextInt(300);
            
            //generate a random color
            Color color = new Color(randomNumbers.nextInt(256), randomNumbers.nextInt(256), randomNumbers.nextInt(256));
            
            //add the line to the list of Lines to be displayed
            lines[count] = new MyLine(x1, y1, x2, y2, color);
        }
    }
    
    //for each shape array, draw the individual shapes
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        //draw the lines
        for(MyLine line: lines){
            line.draw(g);
        }            
    }
}//end class

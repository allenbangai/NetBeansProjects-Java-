/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrawPanel;
import java.awt.Graphics;
import javax.swing.JPanel;
/**
 *
 * @author DELL
 */
public class DrawPanel extends JPanel {
    //draws an x from the coner of the panel
    public void paintComponent(Graphics g){
        
        //call paintComponent to ensure the panel displays correctly
        super.paintComponent(g);
        
        int width = getWidth();
        int height = getHeight();
        
        //draw a line from the upper left to the lower-right
        g.drawLine(0, 0, width, height);
        //drawline from lower left to upper wright
        g.drawLine(0, height, width, 0);        
    } 
}

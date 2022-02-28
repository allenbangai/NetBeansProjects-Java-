package guichapter06;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
/**
 *Drawing a smiley face using colors and filled shapes
 * @author DELL
 */
public class DrawSmiley {
    public static void main(String[] args) {
        // TODO code application logic here
        DrawSmiley01 panel = new DrawSmiley01();
        JFrame allenapplication = new JFrame();
        
        allenapplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        allenapplication.add(panel);
        allenapplication.setSize(250, 250);
        allenapplication.setVisible(true);
    }
}//end class DrawSmiley

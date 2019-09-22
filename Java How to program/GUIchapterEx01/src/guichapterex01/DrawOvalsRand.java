package guichapterex01;


import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
/*
 * @author DELL
 */
public class DrawOvalsRand {

    public static void main(String[] args) {
        // TODO code application logic here
        ImpDrawRandOvals panel = new ImpDrawRandOvals();
        JFrame allenapplication = new JFrame();
        
        allenapplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        allenapplication.add(panel);
        allenapplication.setSize(500, 500);
        allenapplication.setVisible(true);
    }
    
}

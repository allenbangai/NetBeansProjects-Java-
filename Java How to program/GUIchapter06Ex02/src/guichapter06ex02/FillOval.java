/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guichapter06ex02;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JFrame;
/**
 *
 * @author DELL
 */
public class FillOval {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FillOvalApply panel01 = new FillOvalApply();
        JFrame allenapplication = new JFrame();
        
        allenapplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        allenapplication.add(panel01);
        allenapplication.setSize(250, 250);
        allenapplication.setVisible(true);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer01;
import javax.swing.JFrame;
/**
 *
 * @author DELL
 */
public class Computer01 extends JFrame{
    public static void main(String[] args) {
        // TODO code application logic here
        computerform allen = new computerform();
        
        allen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        allen.setSize(500, 500);
        allen.setVisible(true);
    }
    
}

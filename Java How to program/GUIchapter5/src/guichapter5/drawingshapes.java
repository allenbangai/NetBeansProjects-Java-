/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guichapter5;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author DELL
 */
public class drawingshapes {
    public static void main(String[] args) {
        // TODO code application logic here
        //Obtain input user choice
        String input = JOptionPane.showInputDialog("Enter 1 t0 draw rectangles\n"+"Enter 2 to draw Ovals");
        //convert input to int
        int choice = Integer.parseInt(input);
        //creat the panel with user's input
        shapes panel = new shapes(choice);
        //creat a new JFame
        JFrame allen = new JFrame();
        
        allen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        allen.add(panel);
        allen.setSize(600, 600);
        allen.setVisible(true);
    }
    
}

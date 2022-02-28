/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrawPanel;
import javax.swing.JFrame;

/**
 *
 * @author DELL
 */
public class DrawPanelTest {
    public static void main(String[] args){
        //creat a panel that contains 
        DrawPanel panel = new DrawPanel();
        
        //creat a new frame to hold the panel
        JFrame apply = new JFrame();
        
        //set the frame to exit when it closed
        apply.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        apply.add(panel);//add the panel to the frame
        apply.setSize(250, 250);//set the size of the frame
        apply.setVisible(true);//make frame visible
    }
    
}

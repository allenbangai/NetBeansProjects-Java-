/*
 
 */
package guichapter06;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
/**
 *
 * @author DELL
 */
public class DrawSmiley01 extends JPanel {
    public void paintComponent(Graphics allen){
        super.paintComponent(allen);
        System.out.printf("hello world");
        //draw the face
        allen.setColor(Color.YELLOW);
        allen.fillOval(10, 10, 200, 200);
        
        //draw the eyes
        allen.setColor(Color.BLACK);
        allen.fillOval(55, 65, 30, 30);
        allen.fillOval(130, 65, 30, 30);
        
        //draw the mouth
        allen.fillOval(50, 110, 120, 60);
        
        //"touch up" the mouth into a smile
        allen.setColor(Color.YELLOW);
        //allen.fillRect(50, 110, 120, 30);
        allen.fillRect(50, 105, 120, 50);
    }
}

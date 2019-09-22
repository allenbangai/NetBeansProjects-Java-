/**/
package guichapter5;
import java.awt.Graphics;
import javax.swing.JPanel;
/**
 * https://softalien.co/psx-emulator-for-pc-windows.html
 *
 * @author DELL
 */
public class shapes extends JPanel{
    //users choice of which shape to draw
    private final int choice;
    //constructor sets the users choice
    public shapes(int userChoice){
        choice = userChoice;
    }
    //draw a cascade of shapes starting from top left corner
    @Override
    public void paintComponent(Graphics graph){
        super.paintComponent(graph);
        for(int i=0; i<10; i++){
            //pick the shape base on the user choice
            switch(choice){
                case 1:
                    graph.drawRect(10+i*10, 10+i*10, 50+i*50, 50+i*50);
                case 2:
                    graph.drawOval(10+i*10, 10+i*10, 50+i*50, 50+i*50);
                    break;
                case 3:
                    /*graph.drawOval(250, 250, 100, 100);
                    graph.drawOval(240, 240, 120, 120);
                    graph.drawOval(230, 230, 140, 140);
                    graph.drawOval(220, 220, 160, 160);*/
                    /*the above commented algorithm helps you understand how the circles where being drawn*/
                    int k =250;
                    int n=100;                
                    int j=0;
                    while(j<20){
                        graph.drawOval(k, k, n, n);
                        k=k-10;
                        n=n+20;
                        j++;
                    }
                    break;
                    
            }
        }       
    }
}

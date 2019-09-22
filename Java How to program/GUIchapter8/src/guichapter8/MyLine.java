/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guichapter8;
import java.awt.Color;
import java.awt.Graphics;
/**
 *
 * @author DELL
 */
public class MyLine {
    public int x1;
    public int y1; // x and y cordinate of first end point
    public int x2;
    public int y2; // x and y coordinate of second end point
    
    public Color color; //color of this line
    
    //contructor with imput values
    public MyLine(int x1, int y1, int x2, int y2, Color color){
        this.color = color;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    //Draw the line in the specified color
    public void draw(Graphics g){
        g.setColor(color);
        g.drawLine(x1, y1, x2, y2);
    }
}//end class myLine


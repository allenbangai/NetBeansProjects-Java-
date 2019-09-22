/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_generics;
/**
 *
 * @author DELL
 */
public class BoundedTypeDemo {
    public static void main(String[] args){
        Rectangle retangle = new Rectangle(2, 2);
        Circle circle = new Circle(2);
        
        System.out.println("Same Area?" + equalArea(retangle, circle) );
               
    }
    
    public static <E extends GeometricObject> boolean equalArea(E object1, E object2){
        return object1.getArea() == object2.getArea();
    }
    
}

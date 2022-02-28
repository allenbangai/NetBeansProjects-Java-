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
public class GenericMethodDemo {
    public static void main(String[] args){
        Integer[] integers = {1, 2, 3, 4, 5};
        String[] string = {"London", "Paris", "New York", "Austin"};
        
        GenericMethodDemo.<Integer>print(integers);
        GenericMethodDemo.<String>print(string);
                
    }
    
    public static <E> void print(E[] list){
        for (int i = 0; i < list.length; i++){
            System.out.println(list[i]+" ");
        }
        
    }
    
}

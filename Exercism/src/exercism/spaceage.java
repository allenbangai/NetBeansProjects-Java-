/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercism;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class spaceage {
    public static void main(String[] args){
        Scanner allen = new Scanner(System.in);
        System.out.println("Enter your age in seconds and find the year estimate");
        Double age1 = allen.nextDouble();
        //age in seconds
        Double age2 = age1/31557600;
        System.out.println("You are "+age2+" year old on earth");
        System.out.println("You are "+0.2408467*age2+" year old on mecury");
        System.out.println("You are "+0.61519726*age2+" year old on Venus");
        System.out.println("You are "+1.8808158*age2+" year old on Mars");
        System.out.println("You are "+11.862615*age2+" year old on Jupiter");
        System.out.println("You are "+29.447498*age2+" year old on Saturn");
        System.out.println("You are "+84.016846*age2+" year old on Uranus");
        System.out.println("You are "+164.79132*age2+" year old on Neptune");    
    }    
}

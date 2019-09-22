/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter8exercises;

/**
 *
 * @author DELL
 */
public class PackageDataTest {
    public static void main(String[] args){
        PackageData packageData = new PackageData();
        
        
        /// output String representation of packageData
        System.out.printf("%nAfter instantiation :%n%s%n", packageData.tostring());
        packageData.number = 77;
        packageData.string = "Goodbye";
        
        // output String representation of packageData
        System.out.printf("%nAfter changing values:%n%s%n", packageData.tostring());
        
    }
}//end main class

class PackageData{
    int number; //package access instance variable
    String string; //package acces instance variabe
    
    public PackageData(){
        number = 0;
        string = "hello";
    }
    
    //return PackageData object string representation
    public String tostring(){
        return String.format("number: %d; string: %s", number, string);
    }
}//end class packagedata

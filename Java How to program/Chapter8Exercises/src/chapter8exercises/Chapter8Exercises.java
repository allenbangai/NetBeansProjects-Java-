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
public class Chapter8Exercises {
    
    

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Lorige lore;
        System.out.print("dsdsds");
        
        lore = new Lorige();
        System.out.printf(Integer.toString(lore.lo(12, 12))); 
        
        lore = new Lorige(10);
        System.out.println(lore.lo(lore.var1, 12));
        System.out.println(lore.lo(lore.var1, 12));
        
        
    }
    
    public static class Lorige{
        
        int var1, var2;

        public Lorige() {
        }
        

        public Lorige(int var1) {
            this.var1 = var1;
        }
        
        int lo(){
            return var1 + var2;
        }
        
        int lo(int var1, int var2){
            return var1 + var2;
        }        
    }
    
}



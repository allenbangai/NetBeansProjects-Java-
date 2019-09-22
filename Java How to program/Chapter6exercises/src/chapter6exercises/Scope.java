//love codding, writting by bangai
package chapter6exercises;

/**
 * Scope class demonstraes local variable and field scopes
 * @author DELL
 */
public class Scope {
    //field that is accesible to all methods of the class
    private static int x = 1;
    
    /*method main creates and initializes local variale x and calls method
    uselocalvariable and use field*/
    public static void main(String[] args){
        int x = 5;//method local variable x shadows field x
        System.out.println("local x in main is "+x);
        
        uselocalvariable();//uselocalvariable has local variable x
        usefield();//usefield use local scope's field x
        uselocalvariable();//uselocalvariable reinitialize local variable x
        usefield();//class scope field x retains it value
        
        System.out.println("local x in main is "+x);//
    }
    //creat and initialize localvariable x during each call
    public static void uselocalvariable(){
        //int x = 25;
        System.out.println("local x on entering method uselocalvariable is "+x);
        ++x;
        System.out.println("local x on exiting method uselocalvariable is "+x);
    }
    public static void usefield(){
        System.out.println("field x on entering method usefield is "+x);
        x*=10;
        System.out.println("field x before exiting method usefield is "+x);
    }
}

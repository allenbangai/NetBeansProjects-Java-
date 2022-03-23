package solarsystemsizing.Util;

/**
 * This helper class has helper methods used accross several classes
 * @since year 2022
 * 
 * @version 1.0
 * 
 * @author Kamadje Allen
 */
public class Helper {
    public Helper(){
        
    } 
    
    /**
     * Method {@link #isEven(int)} is to return true if input value is even and false if input is odd.
     * @param 
     * val is of type int
     * @return 
     * It return either a true or false
     */
    public boolean isEven(int val){
        if(val%2 == 0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Method {@link #isvalid(int)} checks if number inputed is devisible by either 2, 3 or 5
     * and return true od condition is satisfied.
     * @param value is of type int
     * @return Return value can either be true or false.
     */
    public boolean isvalid(int value) {
        if(value%3 == 0 && value!=3){
            return true;
        }else if ( value%5 == 0 && value!=5){
            return true;
        }else if (value%2 == 0 && value!=2) {
            return true;
        }
        else{
            return false;
        }
    }
}

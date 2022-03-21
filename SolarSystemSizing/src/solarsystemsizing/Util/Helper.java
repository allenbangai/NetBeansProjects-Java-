package solarsystemsizing.Util;

public class Helper {
    public Helper(){
        
    } 
    
    /**
     * Function is to return true if input value is even and false if input is odd.
     * @param 
     * val is of type int
     * @return 
     * It return either a true or false
     */
    protected boolean isEven(int val){
        if(val%2 == 0){
            return true;
        }else{
            return false;
        }
    }
}

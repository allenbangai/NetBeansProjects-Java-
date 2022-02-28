/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5exercise002;

/**
 *
 * @author DELL
 */
public class AutoPolicy {
    private int accountnumber;//policy account number
    private String makeandmodel;// car that the policy applies to
    private String state;//two-letter state abbreviation
    
    //contructor
    public AutoPolicy(int accountnumber, String makeandmodel, String state){
        this.accountnumber = accountnumber;
        this.makeandmodel = makeandmodel;
        this.state = state;
    }
    
    //set the accoountnumber
    public void setaccountnumber(int accountnumber){
        this.accountnumber = accountnumber;
    }
    
    //return the accountnumber
    public int getaccountnumbmer(){
        return accountnumber;
    }
    
    //sets the makeandmodel
    public void setmakeandmodel(String makeandmodel){
        this.makeandmodel = makeandmodel;
    }
    //return the makeandmodel
    public String getmakeandmodel(){
        return makeandmodel;
    }
    
    //sets the makeandmodel
    public void setstate(String state){
        this.state = state;
    }
    //return the makeandmodel
    public String getstate(){
        return state;
    }
    
    //predicate method returns whether the state has no fault insurance
    public boolean isinnofaultstate(){
        boolean nofaultstate;
        //determine whether state has no fault insurance
        switch (getstate()){
            case "MA": case "NY": case "NJ": case "PA":
                nofaultstate = true;
                break;
            default:
                nofaultstate = false;
        }
        return nofaultstate;
        
    }
}//end class Autopolicy

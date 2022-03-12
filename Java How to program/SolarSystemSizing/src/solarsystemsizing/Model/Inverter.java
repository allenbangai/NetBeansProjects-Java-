package solarsystemsizing.Model;

/**
 *
 * @author Kamadje Allen
 */
public class Inverter {
    private int ratedWatt;
    private int ratedVAR;
    private int ratedVA;
    private double powerFactor;
    private int DCinput;

    /**
     * 
     * @param ratedWatt
     * The {@link #ratedWatt} symbolises the real power of the inverter and the value inputed 
     * should be in W and not KW or any other type.
     * @param DCinput
     * The {@link #DCinput} symbolises the DC input voltage of the inverter and it is inputed in VDC.
     * This is the voltage that the inverter takes to convert direct current (ADC) to 
     * AC current.
     */
    public Inverter(int ratedWatt, int DCinput){
        this.ratedWatt = ratedWatt;
        this.DCinput = DCinput;
    }

    /**
     * This private constructor describes the charateristics of a class Inverter with all field
     * variables instatiated.
     * @param ratedWatt
     * The {@link #ratedWatt} symbolises the real power of the inverter and the value inputed 
     * should be in W and not KW or any other type.
     * @param ratedVAR
     * The {@link #ratedVAR} symbolises the reactive power of the inverter and the value inputed 
     * should be in VAR and not KVAR or any other type.
     * @param ratedVA
     * The {@link #ratedVA} symbolises the apparent power of the inverter and the value inputed 
     * should be in VA and not KVA or any other one.
     * @param powerFactor
     * The {@link #powerFactor} gives the ratio of ratedWatt to ratedVA and must be less 
     * than one (<1).
     * @param DCinput 
     * The {@link #DCinput} symbolises the DC input voltage of the inverter and it is inputed in VDC.
     * This is the voltage that the inverter takes to convert direct current (ADC) to 
     * AC current.
     */
    private Inverter(int ratedWatt, int ratedVAR, int ratedVA, double powerFactor, int DCinput) {
        this.ratedWatt = ratedWatt;
        this.ratedVAR = ratedVAR;
        this.ratedVA = ratedVA;
        this.powerFactor = powerFactor;
        this.DCinput = DCinput;
    }
    
    /**
     * This constructor is for inverters with the followng characteristics: {@link #ratedWatt}, 
     * {@link #DCinput}, and {@link #powerFactor}.
     * @param ratedWatt
     * The {@link #ratedWatt} symbolises the real power of the inverter and the value inputed 
     * should be in W and not KW or any other type.
     * @param powerFactor
     * The {@link #powerFactor} gives the ratio of ratedWatt to ratedVA and must be less 
     * than one (<1).
     * @param DCinput
     * The {@link #DCinput} symbolises the DC input voltage of the inverter and it is inputed in VDC.
     * This is the voltage that the inverter takes to convert direct current (ADC) to 
     * AC current.
     * @return
     * This constructor returns the object of the constructor {@link #Inverter(int, int, int, double, int)}
     * which is a private constructor instantiating an Inverter with all the field parameters of 
     * the class Inverter.
     */
    public Inverter inverterWatt_PF(int ratedWatt, double powerFactor, int DCinput){
        this.ratedVA = (int) (ratedWatt/powerFactor);
        this.ratedVAR = squareSubstr(this.ratedVA, ratedWatt);
        return new Inverter(ratedWatt, this.ratedVAR, this.ratedVA, powerFactor, DCinput);
    }   
    
    /**
     * This constructor is for inverters with the followng characteristics: {@link #ratedVAR}, 
     * {@link #ratedVA}, and {@link #DCinput}.
     * @param ratedVA
     * The {@link #ratedVA} symbolises the apparent power of the inverter and the value inputed 
     * should be in VA and not KVA or any other one.
     * @param ratedVAR
     * The {@link #ratedVAR} symbolises the reactive power of the inverter and the value inputed 
     * should be in VAR and not KVAR or any other type.
     * @param DCinput
     * The {@link #DCinput} symbolises the DC input voltage of the inverter and it is inputed in VDC.
     * This is the voltage that the inverter takes to convert direct current (ADC) to 
     * AC current.
     * @return
     * This constructor returns the object of the constructor {@link #Inverter(int, int, int, double, int)}
     * which is a private constructor instantiating an Inverter with all the field parameters of 
     * the class Inverter.
     */
    public Inverter inverterVA_VAR(int ratedVA, int ratedVAR, int DCinput){
        this.ratedWatt = squareSubstr(ratedVA, ratedVAR);
        this.powerFactor = (double) (this.ratedWatt / ratedVA);
        return new Inverter(this.ratedWatt, ratedVAR, ratedVA, powerFactor, DCinput);
    }   
    
    /**
     * This constructor is for inverters with the followng characteristics: {@link #ratedVA}, 
     * {@link #powerFactor}, and {@link #DCinput}.
     * @param ratedVA
     * The {@link #ratedVA} symbolises the apparent power of the inverter and the value inputed 
     * should be in VA and not KVA or any other one.
     * @param powerFactor
     * The {@link #powerFactor} gives the ratio of ratedWatt to ratedVA and must be less 
     * than one (<1).
     * @param DCinput
     * The {@link #DCinput} symbolises the DC input voltage of the inverter and it is inputed in VDC.
     * This is the voltage that the inverter takes to convert direct current (ADC) to 
     * AC current.
     * @return
     * This constructor returns the object of the constructor {@link #Inverter(int, int, int, double, int)}
     * which is a private constructor instantiating an Inverter with all the field parameters of 
     * the class Inverter.
     */
    public static Inverter inverterVA_PF(int ratedVA, double powerFactor, int DCinput){
        int ratedWatt = (int) (ratedVA*powerFactor);
        int ratedVAR = squareSubstr(ratedVA, ratedWatt);
        return new Inverter(ratedWatt, ratedVAR, ratedVA, powerFactor, DCinput);
    }   
    
    /**
     * This constructor is for inverters with the followng characteristics: {@link #ratedVAR}, 
     * {@link #powerFactor}, and {@link #DCinput}.
     * @param ratedVAR
     * The {@link #ratedVAR} symbolises the reactive power of the inverter and the value inputed 
     * should be in VAR and not KVAR or any other type.
     * @param powerFactor
     * The {@link #powerFactor} gives the ratio of ratedWatt to ratedVA and must be less 
     * than one (<1).
     * @param DCinput
     * The {@link #DCinput} symbolises the DC input voltage of the inverter and it is inputed in VDC.
     * This is the voltage that the inverter takes to convert direct current (ADC) to 
     * AC current.
     * @return
     * This constructor returns the object of the constructor {@link #Inverter(int, int, int, double, int)}
     * which is a private constructor instantiating an Inverter with all the field parameters of 
     * the class Inverter.
     */
    public static Inverter inverterVAR_PF(int ratedVAR, double powerFactor, int DCinput){
        int ratedVA = ratedVAR / squareSubstr(1, powerFactor);
        int ratedWatt = (int) (ratedVA * powerFactor);
        return new Inverter(ratedWatt, ratedVAR, ratedVA, powerFactor, DCinput);
    }   
    
    /**
     * This constructor is for inverters with the followng characteristics: {@link #ratedVAR}, 
     * {@link #ratedWatt}, and {@link #DCinput}.
     * @param ratedWatt
     * The {@link #ratedWatt} symbolises the real power of the inverter and the value inputed 
     * should be in W and not KW or any other type.
     * @param ratedVAR
     * The {@link #ratedVAR} symbolises the reactive power of the inverter and the value inputed 
     * should be in VAR and not KVAR or any other type.
     * @param DCinput
     * The {@link #DCinput} symbolises the DC input voltage of the inverter and it is inputed in VDC.
     * This is the voltage that the inverter takes to convert direct current (ADC) to 
     * AC current.
     * @return
     * This constructor returns the object of the constructor {@link #Inverter(int, int, int, double, int)}
     * which is a private constructor instantiating an Inverter with all the field parameters of 
     * the class Inverter.
     */
    public static Inverter inverterWatt_VAR(int ratedWatt, int ratedVAR, int DCinput){
        int ratedVA = squareSum(ratedWatt, ratedVAR);
        double powerFactor = ratedWatt / ratedVA;
        return new Inverter(ratedWatt, ratedVAR, ratedVA, powerFactor, DCinput);
    }

    /**
     * This constructor is for inverters with the followng characteristics: {@link #ratedVA}, 
     * {@link #powerFactor}, and {@link #DCinput}.
     * @param ratedWatt
     * The {@link #ratedWatt} symbolises the real power of the inverter and the value inputed 
     * should be in W and not KW or any other type.
     * @param ratedVA
     * The {@link #ratedVA} symbolises the apparent power of the inverter and the value inputed 
     * should be in VA and not KVA or any other one.v
     * @param DCinput
     * The {@link #DCinput} symbolises the DC input voltage of the inverter and it is inputed in VDC.
     * This is the voltage that the inverter takes to convert direct current (ADC) to 
     * AC current.
     * @return
     * This constructor returns the object of the constructor {@link #Inverter(int, int, int, double, int)}
     * which is a private constructor instantiating an Inverter with all the field parameters of 
     * the class Inverter.
     */
    public static Inverter inverterWatt_VA(int ratedWatt, int ratedVA, int DCinput){
        int ratedVAR = squareSubstr(ratedVA, ratedWatt);
        double powerFactor = ratedWatt / ratedVA;
        return new Inverter(ratedWatt, ratedVAR, ratedVA, powerFactor, DCinput);
    }

    /**
     * @return int return the {@link #ratedWatt}
     * This give the rated output Real Power or to say the power in Watt.
     * It is usually denoted in KW but here, the return power is in W.
     */
    public int getRatedWatt() {
        return ratedWatt;
    }

    /**
     * @return int return the {@link #ratedVAR}
     * This give the rated output Reactive power of the inverter.
     * It is usually denoted in KVAR but here, the value is in VAR.
     */
    public int getRatedVAR() {
        return ratedVAR;
    }

    /**
     * @return int return the {@link #ratedVA}
     * This give the rated output Apparent power of the inverter.
     * It is usually denoted in KVA but here, the value is in VA.
     */
    public int getRatedVA() {
        return ratedVA;
    }

    /**
     * @return int return the {@link #powerFactor}
     * The inverter being a AC appliance has a power factor.
     * This power factor give the amount of reactive to real power consumed.
     * It doesn't have any unit and must be less than one.
     */
    public double getPowerFactor() {
        return powerFactor;
    }

    /**
     * @return int return the DCinput
     * The {@link #DCinput} is takes in a particular input rated voltage in VDC.
     * The DC input is in volt.
     */
    public int getDCinput() {
        return DCinput;
    }
    
    /**
     * This method takes in two parameters, cast them to Double type, and does the 
     * sum of the square of each of the cast parameters a and b.
     * This sum this then passed into a function {@link #rootVal(double)} and return the 
     * square root of the passed value in Integer format.
     * @param a
     * The value passed is of tyoe double
     * @param b
     * The value passed is of type double
     * @return
     * The return value is of type interger
     */
    private static int squareSum(double a, double b){
        return rootVal((a*a) + (b*b));
    }

    /**
     * This method takes in two parameters, cast them to Double type, and does the 
     * substraction of the square (first - second) of each of the passed parameters a and b.
     * The substracted value this then passed into a function rootVal(arg) and the return  
     * square root of the passed value is in Integer format.
     * @param a
     * The value passed is of tyoe double
     * @param b
     * The value passed is of type double
     * @return
     * The returned value is of type interger
     */
    private static int squareSubstr(double a, double b){
        return rootVal((a*a) - (b*b));
    }

    /**
     * This method computes the square roots of any value being pass as argurment
     * @param a
     * Takes a parameter of type double
     * @return
     * Returns the square root of the parameter a
     */
    private static int rootVal(double a){
        return (int) Math.sqrt(a);
    }
    
    //TODO 3: Complete documentation for class Inverter
    
}

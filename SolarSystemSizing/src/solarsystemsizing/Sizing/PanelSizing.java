/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solarsystemsizing.Sizing;

import java.util.ArrayList;

import solarsystemsizing.Model.Panel;
import solarsystemsizing.Util.Helper;

/**
 * Class solar panel
 * @since year 2022
 * 
 * @version 1.0
 * 
 * @author Kamadje Allen
 */
public class PanelSizing {
    private Helper helper = new Helper();
    private double energy;
    private double irradiance;
    /**
     * This variable comprises all the available solar panels 
     * and their respective power
     */
    private ArrayList<Integer> panelList = new ArrayList<>();
    private ArrayList<Panel> panels = new ArrayList<>();
    private int panelNumber;
    private int position;

    /**
     * Constructor Solar panel
     * @param energy
     * @param irradiance 
     */
    public PanelSizing(double energy, double irradiance) {
        this.energy = energy;
        this.irradiance = irradiance;
    }    

    /**
     * 
     * @param energy
     * @param irradiance
     * @param panels
     */
    public PanelSizing(double energy, double irradiance, ArrayList<Panel> panels) {
        this.energy = energy;
        this.irradiance = irradiance;
        this.panels = panels;
        //initializing method to find panelNumber and panel power position
        this.findPanelNumber();
    }
    

    public PanelSizing() {
    }

    /**
     * Setter for initiating private variable energy
     * @param energy 
     */
    public void setEnergy(float energy) {
        this.energy = energy;
    }

    /**
     * Setter for initiating private variable irradiance
     * @param irradiance 
     */
    public void setIrradiance(float irradiance) {
        this.irradiance = irradiance;
    }

    /** 
     * @return 
     * Method returns the system energy
     */
    public double getEnergy() {
        return energy;
    }

    /**
     * @return 
     * Method returns the system solar irradiance for the particular location
     */
    public double getIrradiance() {
        return irradiance;
    }

    /**
     * Method getPanelNumber
     * @return
     * This method returns the number of panels needed from the selected panel power
     * Return value is of type int
     */
    public int getPanelNumber() {
        return panelNumber;
    }

    /** 
     * Method {@link #getPanelPower()}
     * @return
     * This method returns the selected panel power for sizing the system
     * Returned value is of type Integer
     */
    public int getPanelPower() {
        return getPanel().getPower();
    }

    /**
     * Method {@link #getPanel()}
     * @return
     * This method returns the selected panel object for sizing the system
     * The returned value is of type Panel giving you the panelVoltage, panelPower, and 
     * panelNominalVoltage.
     */
    public Panel getPanel(){
        return panels.get(position);
    }
    
    /**
     * Private method to get the smallest number of panels needed for sizing the system.
     * This method also helps to determine to determine the type of panel object needed for sizing the object
     */
    private void findPanelNumber(){        
        float val;
        for(Panel panel : panels){
            val = (float)panel.getPower();
            panelNumber = (int) Math.round(energy/(val*irradiance));
            if (!helper.isvalid(panelNumber)) {
                panelNumber++;
            }
            panelList.add(panelNumber);         
        }
        panelNumber = panelList.get(0);
        //this for loop is to get the smallest number of panels needed possible as well as the position of the
        //panel power in the panel list
        for (int i = 0; i < panelList.size(); i++) {
            int num = panelList.get(i);
            if (panelNumber >= num) {
                panelNumber = num;
                position = i;
            }
        }
    }

    /**
     * @return
     * This method returns a list of possible panel connections from the number panels needed to size the system.
     * The user can now chose among this connection which one will he prefere for his system.
     */
    public ArrayList<PanelConnection> getPanelConnectionList(){
        int panelNumber = getPanelNumber();
        ArrayList<PanelConnection> pList = new ArrayList<>();
        for(int i = 2; i < panelNumber; i++){
            if(panelNumber == 1){
                pList.add(new PanelConnection(1, 1));
                break;
            }
            if(panelNumber == 2){
                pList.add(new PanelConnection(2, 1));
                pList.add(new PanelConnection(1, 2));
                break;
            }
            else{
                if(panelNumber%i == 0){
                    pList.add(new PanelConnection(i, panelNumber/i));
                }
            }
        }
        return pList;
    }

    /**
     * @return
     * Returns an object of the class PanelConnection with a default panel connection for the system 
     * which contains number of series and parallel conections.
     */
    public PanelConnection getPanelConnection() {
        PanelConnection panelConnection = new PanelConnection(1, 1);
        ArrayList<PanelConnection> pList = getPanelConnectionList();
        int i = 0;
        for(PanelConnection connection: pList){
            int val1=0, val2=0;
            val2 = Math.abs(connection.getParallelConnection() - connection.getSeriesConnection());
            if(i==0){
                val1 = val2;
            }
            if(val1 >= val2){
                val1 = val2;
                panelConnection = connection;
            }
            i++;
        }
        return panelConnection;
    }

    @Override
    public String toString() {
        return "The Panels Sizing is as folows: {" +
        "\n Panel Power= '" + getPanelPower() +
        "W',\n Panel Voltage= '" + getPanel().getVoltage() + 
        "V',\n Panel Nominal Voltage= '" + getPanel().getNominalVoltage() +
        "V',\n Number of Panels= '" + getPanelNumber() +
        "',\n Number of panels in series= '" + getPanelConnection().getSeriesConnection() +
        "',\n Number of panels in parrallel= '" + getPanelConnection().getParallelConnection() +
        "'}";
    }

    /**
    * 
    * Class solar panel
    * @since year 2022
    * 
    * @version 1.0
    * 
    * @author Kamadje Allen
    */
    public class PanelConnection{
        private int seriesConnection;
        private int parallelConnection;

        /**
         * Constructor for creating object of panel connections
         * @param seriesConnection
         * Number of connection of panels in series
         * @param parallelConnection
         * Number of connection of panels in parallel
         */
        public PanelConnection(int seriesConnection, int parallelConnection){
            this.parallelConnection = parallelConnection;
            this.seriesConnection = seriesConnection;
        }

        /**
         * @return
         * Return the number of series of connection for panels
         */
        public int getSeriesConnection(){
            return seriesConnection;
        }

        /**
         * @return
         * Returns the number of parallel connections of panels
         */
        public int getParallelConnection() {
            return parallelConnection;
        }

        @Override
        public String toString() {
            return "You connection of panels is as follows {"+
            "', series connection: '" + getSeriesConnection() +
            "', parallel connection: '" + getParallelConnection() +
            "'}";
        }
    }

}

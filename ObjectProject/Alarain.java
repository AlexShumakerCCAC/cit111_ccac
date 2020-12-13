/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectProject;

/**
 *
 * @author alexs
 */
public class Alarain {
    //create variables
    private int avgHealing = 50;
    private int spec;
    // return values for getHealingAmt
    public final int HEAL_GREATER_THAN_AVERAGE = 1;
    public final int HEAL_EQUAL_AVERAGE = 2;
    public final int HEAL_LESS_THAN_AVERAGE = 3;
    //takes user input and transfers it into a value that will be read by the 
    //switch in order to determine Alarains optimal spec
    public int getHealingAmt(int heal) {
        
        if(heal > avgHealing) {
            spec = HEAL_GREATER_THAN_AVERAGE;
        }
        else if (heal == avgHealing) {
            spec = HEAL_EQUAL_AVERAGE;
        }
        else {
            spec = HEAL_LESS_THAN_AVERAGE;
        }
        
        return spec;
    }//close method
    
}//close class

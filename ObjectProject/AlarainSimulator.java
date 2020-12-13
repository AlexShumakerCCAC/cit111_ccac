/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectProject;
import java.util.Scanner;

/**
 * This class takes a user inputted value and puts it into another object to
 * determine the best class to be playing based off the user's value
 * @author alexs
 */
public class AlarainSimulator {
    
    public static void main(String[] args) {
        //create instance
        Alarain Sim1 = new Alarain();
        //create and use Scanner
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter Alarains average healing: ");
        int heal = userInput.nextInt();
        //call methods
        int spec = Sim1.getHealingAmt(heal);
        //use switch to determine how Alarains healing is doing today, and what
        //class he should be playing based on it
        switch(spec){
            case 1:
                System.out.println("Wow, that's a lot of healing! You are a great"
                    + " healer!");
                break;
            case 2:
                System.out.println("You're healing is on par. Maybe you should try"
                    + " tanking today instead");
                break;
            case 3:
                System.out.println("Yikes, you're healing is below average. Maybe"
                    + " you should try dps'ing today.");
                break;
        }
    }//close main method
    
}//end class
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.util.Scanner;
import java.util.Random;
import java.math.BigInteger;
import week4.UserInput;
/**
 *
 * @author alexs
 */
public class miniProjectMysteryDoors {
    
    public static void main(String[] args) {
        //declare variables
        int door;
        //declare scanner
        Scanner userInput = new Scanner(System.in);
        //display prompt
        System.out.println("You wake up in a dark room, you stand up from the"
                + " cot you were placed on and look around.");
        System.out.println("On a wall there are three levers, there is nothing"
                + " else in the room, no exit, which level do you pull?");
        //use scanner to get user input on which door is selected
        door = userInput.nextInt();
        
        switch(door) {
            case 1:
                lifeLesson();
                break;
            case 2:
                steveHarvey(userInput);
                break;
            case 3:
                error404();
                break;
            default:
                System.out.println("That's not an option, the darkness swollows"
                        + "you up, and you are never heard from again");
                break;
        }
                
    }//close main method
    
    //This method generates a random number, and then inserts that number into
    //the scenario where the user is taught a valuable life lesson
    public static void lifeLesson() {
        Random r = new Random();
        BigInteger bigInt = new BigInteger(20, r);
        System.out.println("You pull the lever, and you hear a rumbling from"
                + " above you.");
        System.out.println("You look up just in time to see " + bigInt + 
                " books titled 'Words' fall down.");
        System.out.println("I guess sticks and stones may break your bones, "
                + "but Words hurt a lot more");
    }//close method lifeLesson
    
    //This method accepts user input in response to Steve Harvey's question,
    //and gives outputs accordingly
    public static void steveHarvey(Scanner userInput) {
        System.out.println("You pull the leaver and hear Steve Harvey's voice "
                + "ring out and ask, 'What is one plus one?'");
        int answer = userInput.nextInt();
        if (answer == 2) {
            System.out.println("You hear Steve Harvey's voice respond, "
                    + "'Correct!' You wake up in your bed in a cold sweat.");
        }
        else {
            System.out.println("The world starts to crumble around you and"
                    + " you wake up screaming.");
        }
    }//close method steveHarvey
    
    //This method
    public static void error404() {
        for(int i = 0; i < 20; i++) {
            System.out.println("Error 404, Error 404, Error 404, Error 404");
        }
    }//close method error404
}

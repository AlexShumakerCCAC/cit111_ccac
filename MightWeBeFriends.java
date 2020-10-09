/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6Project;

import java.util.Scanner;
/**
 *
 * @author alexs
 */
public class MightWeBeFriends {
    public static void main(String[] args) {
        //declare vaiables
        int score = 0;
        
        String answer;
        //declare scanners
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Hello possible friend, let's see if we can be friends.");
        System.out.println("Do you like to read? (y/n)");
        answer = inputUser.next();
        if(answer.equals("y")) {
            score++;
        }
        else {
            score--;
        }

        System.out.println("Do you like cats or dogs? (c/d)");
        answer = inputUser.next();
        if(answer.equals("c")) {
            score++;
        }
        else {
            score--;
        }

        System.out.println("Do you like playing video games? (y/n)");
        answer = inputUser.next();
        if(answer.equals("y")) {
            score++;
        }
        else {
            score--;
        }

        System.out.println("Do you like to listen to music? (a good genre"
                + " like rock or alternative preferably) (y/n)");
        answer = inputUser.next();
        if(answer.equals("y")) {
            score++;
        }
        else {
            score--;
        }
        
        if(score > -2) {
        System.out.println("I think we can be friends!");
        }
        else {
        System.out.println("I don't think we can be friends...");
        }
        
    }//close main
}//close class

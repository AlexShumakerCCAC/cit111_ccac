/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 * simulates basic recorded data about a road trip to Utah
 * @author alexs
 */
public class RoadTrip {
    
    public static void main(String[] args){
        
        //declaring variables
        final double NEDS_MILES_PER_GALLON = 32;
        final double AVERAGE_GAS_PRICE = 2.65;
        
        int maxPassengers = 5;
        int currentNumberOfPassengers = 1;
        double tripOdometer = 0;
        double cashOnHand = 300;
        double distanceToMoabUtah = 1806;
        double legDistance;
        String carMake = "1996 Mazda Protege"; //primitive type variable (first letter lowercase)
        String carName = "Nedfry";
        boolean carFull = false;
        boolean destinationReached = false;
        
        
        
        System.out.println("Road Trip Simulator!");
        System.out.println("You are driving a " + carMake + " whose name is " + carName + ", and he can carry " + maxPassengers + " people");
        System.out.println(carName + " is currently carrying " + currentNumberOfPassengers + " person/s");
        System.out.println("Currently the Trip-Odometer is at: " + tripOdometer + " miles.");
        System.out.println("Your trip budget is: $" + cashOnHand);
        System.out.println("Your distance to Moab Utah from your current loaction is " + distanceToMoabUtah + " miles.");
        System.out.print("The car is ");
        
        if (carFull == false)
            System.out.println("not full.");
        else
            System.out.println("full.");
        
        System.out.print("You have ");
        
        if (destinationReached == false)
            System.out.println("not reached you destination yet! One thousand bottles of soda on the wall...");
        else
            System.out.println("reached your destination! You can stop singing Karaoke now.");
        
        System.out.println("");
        System.out.println("Beginning Leg #1");
        
        
        
        
        double quarterInDecimal = 0.25;
        legDistance = distanceToMoabUtah * quarterInDecimal;
        tripOdometer += legDistance;
        distanceToMoabUtah -= legDistance;
        System.out.println("Oh boy, a HitchHiker! And he wants to go west as well!");
        if (currentNumberOfPassengers == maxPassengers) {
            System.out.println("Sorry HitchHiker, I don't have any room for you!");
        }
        else {
            System.out.println("Welcome aboard Mr. HitchHiker!");
            currentNumberOfPassengers ++;
            System.out.println("Your current number of passengers is now: " + currentNumberOfPassengers);
        }
        
        double gasPriceForLeg = (legDistance / NEDS_MILES_PER_GALLON) * AVERAGE_GAS_PRICE;
        cashOnHand -= gasPriceForLeg;
        
        
        
        
        System.out.println("");
        System.out.println("Stats after Leg #1");
        
        System.out.println(carName + " is currently carrying " + currentNumberOfPassengers + " person/s");
        System.out.println("Currently the Trip-Odometer is at: " + tripOdometer + " miles.");
        System.out.println("Your trip budget is: $" + cashOnHand);
        System.out.println("Your distance to Moab Utah from your current loaction is " + distanceToMoabUtah + " miles.");
        System.out.print("The car is ");
        
        if (carFull == false)
            System.out.println("not full.");
        else
            System.out.println("full.");
        
        System.out.print("You have ");
        
        if (destinationReached == false)
            System.out.println("not reached you destination yet! One thousand bottles of soda on the wall...");
        else
            System.out.println("reached your destination! You can stop singing Karaoke now.");
        
        
        
        System.out.println("");
        System.out.println("Beginning of leg #2");
        
        double halfInDecimal = 0.5;
        legDistance = distanceToMoabUtah * halfInDecimal;
        tripOdometer += legDistance;
        distanceToMoabUtah -= legDistance;
        System.out.println("Oh Boy! Another two HitchHikers!");
        if (currentNumberOfPassengers >= maxPassengers--) {
            System.out.println("Sorry Mr. and Mrs. HitchHiker, I don't have any room for you  two!");
        }
        else {
            System.out.println("Welcome aboard Mr. and Mrs. HitchHiker!");
            currentNumberOfPassengers += 2;
            System.out.println("Your current number of passengers is now: " + currentNumberOfPassengers);
        }
        
        gasPriceForLeg = (legDistance / NEDS_MILES_PER_GALLON) * AVERAGE_GAS_PRICE;
        cashOnHand -= gasPriceForLeg;
        
        
        
        System.out.println("");
        System.out.println("Stats after Leg #2");
        
        System.out.println(carName + " is currently carrying " + currentNumberOfPassengers + " person/s");
        System.out.println("Currently the Trip-Odometer is at: " + tripOdometer + " miles.");
        System.out.println("Your trip budget is: $" + cashOnHand);
        System.out.println("Your distance to Moab Utah from your current loaction is " + distanceToMoabUtah + " miles.");
        System.out.print("The car is ");
        
        if (carFull == false)
            System.out.println("not full.");
        else
            System.out.println("full.");
        
        System.out.print("You have ");
        
        if (destinationReached == false)
            System.out.println("not reached you destination yet! One thousand bottles of soda on the wall...");
        else
            System.out.println("reached your destination! You can stop singing Karaoke now.");
        
        
        
        System.out.println("");
        System.out.println("Beginning of leg #3");
        
        legDistance = distanceToMoabUtah;
        tripOdometer += legDistance;
        distanceToMoabUtah -= legDistance;
        System.out.println("Oh Boy! Another couple of HitchHikers!");
         if (currentNumberOfPassengers >= maxPassengers--) {
            System.out.println("Sorry Mr. and Mrs. HitchHiker, I don't have any room for you two!");
        }
        else {
            System.out.println("Welcome aboard Mr. and Mrs. HitchHiker!");
            currentNumberOfPassengers += 2;
            System.out.println("Your current number of passengers is now: " + currentNumberOfPassengers);
        }
        
        gasPriceForLeg = (legDistance / NEDS_MILES_PER_GALLON) * AVERAGE_GAS_PRICE;
        cashOnHand -= gasPriceForLeg;
        
        System.out.println("");
        System.out.println("Stats after Leg #3");
        
        System.out.println(carName + " is currently carrying " + currentNumberOfPassengers + " person/s");
        System.out.println("Currently the Trip-Odometer is at: " + tripOdometer + " miles.");
        System.out.println("Your trip budget is: $" + cashOnHand);
        System.out.println("Your distance to Moab Utah from your current loaction is " + distanceToMoabUtah + " miles.");
        
        if (distanceToMoabUtah == 0)
            destinationReached = true;
        else
            destinationReached = false;
        
        System.out.print("The car is ");
        
        if (carFull == false)
            System.out.println("not full.");
        else
            System.out.println("full.");
        
        System.out.print("You have ");
        
        if (destinationReached == false)
            System.out.println("not reached you destination yet! One thousand bottles of soda on the wall...");
        else
            System.out.println("reached your destination! You can stop singing Karaoke now.");
        
    }//close main
}//close class

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.skillsdemo2;
//Utility Library for calculations
public class StudentKevinLibrary {
 
    //method to convert steps into kilometers
    public static double runStepInterface(int steps, double strideLength){
                // calculates the distance in kilometres
        double distanceKm = (steps * strideLength) / 1000.0;
 
        // outputs the kilometers
        return distanceKm;
    }

    //method to find out how much daily water goal is completed 
    public static double runHydrationIntakeInterface(double targetVolume, double currentVolume) {
     //sets default hydration percentage
        double percentage = 0;
     //checks if target volume si valid and calculates percentage
        if (targetVolume > 0) {
            percentage = (currentVolume / targetVolume) * 100;
        }
     //outputs the hydration percentage
        return percentage;
    }
    //method to check if daily calories are under, over or balanced 
    public static String runCalorieInterface(double netCalories, double grossIntake, double exerciseBurn){
        //stores the calorie status
        String status;
     //checks if net calories are under, over or balanced
        if (netCalories < 0) {
            status = "Deficit";
        } else if (netCalories > 0) {
            status = "Surplus";
        } else {
            status = "Maintenance";
        }
     //outputs the calorie status
        return status;
    }
    

}

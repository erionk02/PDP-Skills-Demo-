/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.skillsdemo2;

public class StudentKevinLibrary {
 
    
    public static double runStepInterface(int steps, double strideLength){
                // calcultes the distance
        double distanceKm = (steps * strideLength) / 1000.0;
 
        // outputs the kilometers
        return distanceKm;
    }


    public static double runHydrationIntakeInterface(double targetVolume, double currentVolume) {
        double percentage = 0;
        if (targetVolume > 0) {
            percentage = (currentVolume / targetVolume) * 100;
        }
        return percentage;
    }
    
    public static String runCalorieInterface(double netCalories, double grossIntake, double exerciseBurn){
        
        String status;
        if (netCalories < 0) {
            status = "Deficit";
        } else if (netCalories > 0) {
            status = "Surplus";
        } else {
            status = "Maintenance";
        }
        return status;
    }
    

}
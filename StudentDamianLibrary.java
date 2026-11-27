/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.skillsdemo2;

/**
 *
 * @author eerio
 */
 // Utility Library for basic health and fitness calculations
public class StudentDamianLibrary {

    //Macronututrient Split Matrix Function
    //Converts a calorie target into grams of protein, cabrs and fat
    public static String runMacronutrientInterface(double calories, double proteinPercentage, double carbPercentage, double fatPercentage) {
        // Protein and carbs have 4 calories per gram
         long protein = Math.round(calories * (proteinPercentage / 100) / 4);
        long carbs = Math.round(calories * (carbPercentage / 100) / 4);
        // Fat has 9 calories per gram
        long fat = Math.round(calories * (fatPercentage / 100) / 9);
        
        return "Protein: "+ protein + " g, "+ "Carbohydrates: " +carbs+ " g, " + "Fat: "+ fat + " g";
        }
    
    // Sleep Efficiency Evaluator Function
    // Gives a recovery score based on hours slept and number of wake-ups
    public static String runSleepInterface(double hours, int wakeups){
        //Score against an 8 hour target, minus 7.5 points per wake-up
     double efficiency = (hours / 8) * 100 - (wakeups * 7.5);

        //Keep the score between 0 and 100
        if (efficiency < 0) {
            efficiency = 0;
        }
        if (efficiency > 100) {
            efficiency = 100;
        }
        return "Recovery Index: " +efficiency;
    }

    //Activity Intensity Scaling Factor Function
    // Multiplies BMR by an activity factor to estimate daily calories burned
    public static String runActivityInterface(double factor, double bmr){
        double activityInterface = Math.round(bmr * factor);
        return "System Output: " + activityInterface;
    }
}

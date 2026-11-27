/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.skillsdemo2;

/**
 *
 * @author eerio
 */
public class StudentDamianLibrary {


    public static String runMacronutrientInterface(double calories, double proteinPercentage, double carbPercentage, double fatPercentage) {
         long protein = Math.round(calories * (proteinPercentage / 100) / 4);
        long carbs = Math.round(calories * (carbPercentage / 100) / 4);
        long fat = Math.round(calories * (fatPercentage / 100) / 9);
        
        return "Protein: "+ protein + " g, "+ "Carbohydrates: " +carbs+ " g, " + "Fat: "+ fat + " g";
        }
    
    
    public static String runSleepInterface(double hours, int wakeups){
     double efficiency = (hours / 8) * 100 - (wakeups * 7.5);
        if (efficiency < 0) {
            efficiency = 0;
        }
        if (efficiency > 100) {
            efficiency = 100;
        }
        return "Recovery Index: " +efficiency;
    }
    
    public static String runActivityInterface(double factor, double bmr){
        double activityInterface = Math.round(bmr * factor);
        return "System Output: " + activityInterface;
    }
}

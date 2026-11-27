
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.skillsdemo2;

import java.util.Scanner;
public class SkillsDemo2 {
 
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args){
        boolean keepRunning = true;
        int choice;
        String continueChoice;
        
        System.out.println("Fitness & Health Tracker");
        
        while(keepRunning){
            printMenu();
            System.out.print("Select an option from above(1-10): ");
            choice =  scanner.nextInt();
            
            switch (choice){
                case 1: 
                    runBmiInterface();
                    break;
                
                case 2:
                    runBmrInterface();
                    break;
                    
                case 3:
                    runHeartRaceInterface();
                    break;
                   
                case 4:
                   runHydrationIntakeInterface();
                   break;

               case 5:
                   runStepInterface();
                   break;

               

               case 7:
                   runMacronutrientInterface();
                   break;
               
                case 8:
                   runSleepInterface();
                   break;
                
                case 9:
                   runActivityInterface();
                   break;
             
                case 10:
                    System.out.println("Thank you for using the Fitness & Health Tracker");
                    System.out.println("The system will shut down now...");
                    keepRunning = false;
                    break;
                    
                default:
                    System.out.println("Invalid selection! Please choose 1-10");
                    break;
            }
            if (keepRunning){
                System.out.print("Do you want to continue(Yes/No): ");
                continueChoice = scanner.next();
               
                if(continueChoice.equalsIgnoreCase("No")){
                    
                    keepRunning = false;
                    System.out.println("Thank you for using the Fitness & Health Tracker");
                    System.out.println("The system will shut down now...");
                } else if(continueChoice.equalsIgnoreCase("Yes")){
                    System.out.println("Returning to the main menu...");
                }else{
                    System.out.println("Invalid choice! Returning to the menu...");
                }
                
            }
            
        }
        scanner.close();
    }//main ends 
    
    //Print Menu
    
    private static void printMenu(){
        System.out.println("1. ----Main Core Interfaces----");
        System.out.println("2. Body Mass Index (BMI) Calculator");
        System.out.println("3. Basal Metabolic Rate Zone Suite");
        System.out.println("4. Hydration Intake Tracker");
        System.out.println("5. Step to Distance Converter");
        System.out.println("6. Caloric Expedinture Evaluator");
        System.out.println("7. Macronutrient Split Matrix");
        System.out.println("8. Sleep Efficiency Evaluator");
        System.out.println("9. Activity Intensity Scaling Factor");
        System.out.println("10. System Exit");
    }
    //BMI Interface
    private static void runBmiInterface(){
        System.out.println("Body Mass Index (BMI) Calculator");
        System.out.println("---------------------------------");
        
        System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextDouble();
        
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();
        
        String result = StudentErionLibrary.calculateBmi(weight, height);
        
        System.out.println("Result: "+ result);
    }
    
    //BMR Interface
    private static void runBmrInterface(){
        System.out.println("Basal Metabolic Rate (BMR) Calculator");
        System.out.println("-------------------------------------");
        
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        
        System.out.print("Enter weight in kg: ");
        double weight = scanner.nextDouble();
        
        System.out.print("Enter height in cm: ");
        double height = scanner.nextDouble();
        
        System.out.print("Enter gender (M/F): ");
        String gender = scanner.next();
        
        double result = StudentErionLibrary.calculateBmr(age, weight, height, gender);
        System.out.println("Daily BMR is: "+ result + "calories");
    }
    
    //Target Heart Rate Zone Matrix
    private static void runHeartRaceInterface(){
        System.out.println("Target Heart RAte Zone Matrix");
        System.out.println("------------------------------");
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        String result = StudentErionLibrary.calculateHeartRate(age);
        System.out.println("System Output: "+ result);
    }
        private static void runStepInterface() {
        // creates the scanner
 
        // title 
        System.out.println("Convert Steps to Distance");
 
        // asks user to enter steps
        System.out.print("Enter tracked step counts: ");
        int steps = scanner.nextInt();
 
        // asks user to enter stride length
        System.out.print("Enter average stride length in meters : ");
        double strideLength = scanner.nextDouble();
        double distanceKm = StudentKevinLibrary.runStepInterface(steps, strideLength);
        System.out.printf("System Output: %.2f Kilometers%n", distanceKm);
 
        
    }
        
        private static void runHydrationIntakeInterface(){
       
        // asks user for their target
        System.out.print("Enter objective target volume (ml): ");
        double targetVolume = scanner.nextDouble();
 
        // asks the user to enter volume
        System.out.print("Enter current dynamic intake volume (ml): ");
        double currentVolume = scanner.nextDouble();
 
        double percentage = StudentKevinLibrary.runHydrationIntakeInterface( targetVolume, currentVolume);
        System.out.printf("System Output: %.0f%% Achieved%n", percentage);
 
        
    }
  private static void runCalorieInterface(){
            System.out.println("Caloric Expidenture Evaluator");
            System.out.println("----------------------------");
 
        // Header
        System.out.println("Evaluate Caloric Expenditure");
 
        // Asks user for gross calorie intake
        System.out.print("Enter calorie total gross intake: ");
        double grossIntake = scanner.nextDouble();
 
        // Asks user for active exercise burn
        System.out.print("Enter active exercise burn metrics: ");
        double exerciseBurn = scanner.nextDouble();
        double netCalories = grossIntake - exerciseBurn;
 
        String status = StudentKevinLibrary.runCalorieInterface(exerciseBurn, grossIntake, exerciseBurn);
        System.out.printf("System Output: %.0f kcal (%s)%n", netCalories, status);
 

    }
        private static void runMacronutrientInterface(){
            System.out.println("Macronutrient Split Matrix");
            System.out.println("----------------------------");
            
            System.out.print("Enter your target calories: ");
            double calories = scanner.nextDouble();
            
            System.out.print("Enter protein percentage: ");
            double proteinPercentage = scanner.nextDouble();
            
            System.out.print("Enter carbohydrate percentage: ");
            double carbPercentage = scanner.nextDouble();
            
            System.out.print("Enter fat percentage: ");
            double fatPercentage = scanner.nextDouble();
            
            String result = StudentDamianLibrary.runMacronutrientInterface(calories, proteinPercentage, carbPercentage, fatPercentage);
            System.out.println("System Output: "+ result);
        }
        
        private static void runSleepInterface(){
            System.out.println("Sleep Efficienty Evaluator");
            System.out.println("------------------------------");
            System.out.print("Enter how many hours you slept: ");
            double hours = scanner.nextDouble();
            System.out.print("Enter wake disruptions counts: ");
            int wakeups = scanner.nextInt();
            
            String result = StudentDamianLibrary.runSleepInterface(hours, wakeups);
            System.out.println("System output: "+ result);
        }
        
        private static void runActivityInterface(){
            System.out.println("Activity Intensity Scaling Factor");
            System.out.println("-------------------------------------");
            System.out.print("Enter baseline metabolic metric (BMR): ");
            double bmr = scanner.nextDouble();
            System.out.println("Dynamic scalar options: Sedentary(1.2), Light(1.375), Active(1.55)");
            System.out.print("Enter floating scalar factor: ");
            double factor = scanner.nextDouble();
            
            String result = StudentDamianLibrary.runActivityInterface(factor, bmr);
            System.out.println("System Output: "+ result);
        }
    }
    

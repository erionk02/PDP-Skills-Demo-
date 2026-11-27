/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/
package com.mycompany.skillsdemo2;

/**
*
* @author eerio
*/
public class StudentErionLibrary {


        // BMI calculator
        // calculate the BMI using the weight and the height
        public static String calculateBmi(double weight, double height){
                //divides weight by height squared
            double bmi = weight / (height * height);

            String status;
            //gives the status based on the result of the calculation done 
            if(bmi < 18.5){
                status = "Underweight";
            }else if(bmi < 25){
                status = "Normal Weight";
            }else if(bmi < 30){ 
                status = "Overweight";
            } //if none of the above conditions are met, the status is obese
                else{
                status = "Obese";
            }
           //rounds the BMI to 2 decimal places
           return "BMI: "+ Math.round(bmi * 100.0) / 100.0 + "-" + status;
        }

        //BMR Calculator 
        public static double calculateBmr( int age, double weight, double height, String gender){

            double bmr;
            //checks if the user is male
            //if the user is male it calculates based on the numbers below
            if(gender.equalsIgnoreCase("M")){

                bmr = 88.362 + (13.397 * weight) + (4.799 * height) - (5.667 * age);
              //if the user is not male it calculates based on the numbers below
            }else{
                bmr = 447.593 + (9.247 * weight)+(3.098 * height) - (4.330 * age);
            }
            //returns the bmr with the result
            return bmr;
        }

        //Target Heart Rate Zone Matrix
        public static String calculateHeartRate(int age){
        //calculate the maximum heart rate using the age minus the number 220
            int maximum = 220 - age;
            //calculates the lower target heart rate limit at 50% of maximum
            int lower = (int) (maximum * 0.50);
                //calculates the upper target heart rate limit at 85% of maximum
            int upper = (int) (maximum * 0.85);
            //returns the maximum heart rate and the target heart rate
            return "Maximum Heart Rate: " + maximum +" BPM."
                    + " Target zone: " + lower 
                    + "-" + upper + " BPM";
        }
    }


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


        // TODO code application logic here
        public static String calculateBmi(double weight, double height){
            double bmi = weight / (height * height);

            String status;

            if(bmi < 18.5){
                status = "Underweight";
            }else if(bmi < 25){
                status = "Normal Weight";
            }else if(bmi < 30){ 
                status = "Overweight";
            }else{
                status = "Obese";
            }

           return "BMI: "+ Math.round(bmi * 100.0) / 100.0 + "-" + status;
        }

        //BMR Calculator 
        public static double calculateBmr( int age, double weight, double height, String gender){

            double bmr;

            if(gender.equalsIgnoreCase("M")){

                bmr = 88.362 + (13.397 * weight) + (4.799 * height) - (5.667 * age);

            }else{
                bmr = 447.593 + (9.247 * weight)+(3.098 * height) - (4.330 * age);
            }

            return bmr;
        }

        //Target Heart Rate Zone Matrix
        public static String calculateHeartRate(int age){

            int maximum = 220 - age;

            int lower = (int) (maximum * 0.50);
            int upper = (int) (maximum * 0.85);

            return "Maximum Heart Rate: " + maximum +" BPM."
                    + " Target zone: " + lower 
                    + "-" + upper + " BPM";
        }
    }


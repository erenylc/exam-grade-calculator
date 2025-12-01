/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject9;

import java.util.Scanner;

/**
 *
 * @author Eren
 */
public class Mavenproject9 {

    public static void main(String[] args) {       
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your midterm score: ");
        int midterm = input.nextInt();

        System.out.print("Enter your final score: ");
        int finalExam = input.nextInt();

        double average = (midterm * 0.4) + (finalExam * 0.6);
        System.out.println("Your average: " + average);

        // Convert to int and divide by 10 to group grades
        int group = (int) average / 10;

        switch (group) {
            case 10: // 100
            case 9:  // 90-99
                System.out.println("Letter grade: AA");
                break;
            case 8:  // 80-89
                System.out.println("Letter grade: BA");
                break;
            case 7:  // 70-79
                System.out.println("Letter grade: BB");
                break;
            case 6:  // 60-69
                System.out.println("Letter grade: CB");
                break;
            case 5:  // 50-59
                System.out.println("Letter grade: CC");
                break;
            default: // 0-49
                System.out.println("Letter grade: FF (Failed)");
        }

        input.close();//It closes the resource, meaning the Scanner can no longer be used
    }
}
        
        
       
                
                
        
        
    

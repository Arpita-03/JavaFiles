/*
Write a program to Convert a Kilometer to Miles
 */
package firstjavaprogram;

import java.util.Scanner;


public class Question1_7 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Distance In Kilometer: ");
        Float km = sc.nextFloat();
        
        //Kilometer to miles conversion
        //1 km = 0.62137119 miles
        //1 mile = 1.609344 km
        Float miles = (float)(km * 0.62137119);
        System.out.println("Distance in miles will be: " + miles);
    }
    
}

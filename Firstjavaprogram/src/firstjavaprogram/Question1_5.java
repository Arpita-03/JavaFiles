/*
 Write a java program to detect whether a number entered by the user is integer or not.
 */
package firstjavaprogram;

import java.util.Scanner;


public class Question1_5 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter The Number");
        System.out.println(sc.hasNextInt());
    }
    
}

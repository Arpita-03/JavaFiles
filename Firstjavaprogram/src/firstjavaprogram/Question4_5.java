/*
Write a java program to find whether a year entered by the user is a leap year or not.
 */
package firstjavaprogram;
import java.util.Scanner;

public class Question4_5 {


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a year to check if it is a leap year or not: ");
    int year = sc.nextInt();
    
    if(year % 4 == 0){
        System.out.println(year + " is a leap year");
    }
    else
    {
        System.out.println(year + " is not a leap year");
    }
    
  }
}
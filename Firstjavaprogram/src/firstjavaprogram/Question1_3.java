/*Write a java program which asks the user to enter his/her name and
  greets them with "Hello <name>, have a good day" text. */

package firstjavaprogram;

import java.util.Scanner;


public class Question1_3 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ENTER YOUR NAME");
        String name = sc.next();
        System.out.println("Hello " + name + ",Have a Good Day!");
        
        
    }
    
}

/*
Wtite a program to find out whether a student is pass or fail: 
if it requires total 40% and at least 33% in each subject to pass.
Assume 3 subects and take marks as an input from the user.
 */
package firstjavaprogram;
import java.util.Scanner;

public class Question4_2 {

    public static void main(String[] args) {
        //Taking marks from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER MARKS OF PHYSICS:");
        byte marks1 = sc.nextByte();
        
        System.out.println("ENTER MARKS OF CHEMISTRY:");
        byte marks2 = sc.nextByte();
        
        System.out.println("ENTER MARKS OF MATHS:");
        byte marks3 = sc.nextByte();
        
        
        //Total percentage or average of marks
        float avg = (marks1+marks2+marks3)/3.0f;
        System.out.println("Your overall percentage is" + avg);
        
        
        //Conditions
        if(avg>=40 && marks1>=33 && marks2>=33 && marks3>=33){
            System.out.println("You are pass.");
        }
        else{
            System.out.println("You are fail!!!");
        }
       
    }
    
}

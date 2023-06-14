/*
  Write a java program to find out the day of the week given the number [1 for monday, 2 for tuesday... and so on!] 
 */

package firstjavaprogram;
import java.util.Scanner;

public class Question4_4 {

   
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number: ");
      int day = sc.nextInt();
    
    switch(day){
        case 1:
            System.out.println("Sunday");
        break;
        case 2:
            System.out.println("Monday");
            break;
        case 3:
            System.out.println("Tuesday");
            break;
        case 4:
            System.out.println("Wednesday");
            break;
        case 5:
            System.out.println("Thursday");
            break;  
        case 6:
            System.out.println("Friday");
            break;  
        case 7:
            System.out.println("Saturday");
            break;    
        default:
            System.out.println("It's just week days!");
            
    }
    
    }
}

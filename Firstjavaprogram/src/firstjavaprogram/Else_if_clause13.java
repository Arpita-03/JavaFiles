
package firstjavaprogram;
import java.util.Scanner;

public class Else_if_clause13 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = sc.nextInt();
        
        if (age>50){
          System.out.println("You are Experienced");  
        }
        else if (age>40){
            System.out.println("You are advanced");
        }
        else if (age>30){
            System.out.println("You are beginner");
        }
        else{
            System.out.println("You are not experienced");
        }
        
        
        
      
        
        
    }
    
}

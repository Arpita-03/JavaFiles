
package firstjavaprogram;
import java.util.Scanner;

public class TakingInput04 {

   
    public static void main(String[] args) {
        System.out.println("Taking Input from the User");
        Scanner sc = new Scanner(System.in);
        
    //Taking Input From the User As Integer
        System.out.println("Enter Number 1");
        int a = sc.nextInt();
        
        System.out.println("Enter Number 2");
        int b = sc.nextInt();
        int sum = a + b;
        
        System.out.println("The Sum of these two integers is:");
        System.out.println(sum); 
       
    //Taking Input From the User As Float
        System.out.println("Enter Number 3");
        float c = sc.nextFloat();
        
        System.out.println("Enter Number 4");
        float d = sc.nextFloat();
        float add = c + d;
        
        System.out.println("The Sum of these two float number is:");
        System.out.println(add);
       
    //Taking Input From the User As Float
        System.out.println("Are You Female?");
        boolean e = sc.nextBoolean();
         
        System.out.println(e);
        
    //Checking the Input From the user is Integer or Not
        System.out.println("Enter number 5");
        boolean f = sc.hasNextInt();
        
        System.out.println(f);
    
    //Taking Input From the User As String    
        System.out.println("What is your Name?");
        
        String str = sc.nextLine();
        System.out.println(str);

    }
    
}

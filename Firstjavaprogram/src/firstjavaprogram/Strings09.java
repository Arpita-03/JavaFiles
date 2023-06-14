package firstjavaprogram;
import java.util.Scanner;

public class Strings09 {

    
    public static void main(String[] args) {
        //Two types to create string:
        String name1 = new String("Arpita");
        System.out.println(name1);
        //or
        String name2 = "Arpita";
        System.out.println(name2);
        
        //Different ways to print:
        String country = "India";
        System.out.print("The name of country is: ");
        System.out.println(country);
        int a = 6;
        float b = 8.97f;
        System.out.printf("The value of a is %d and value of b is %f", a,b);
        //%d = format specifier and is used for int
        //%f = used for float
        System.out.format("The value of a is %d and value of b is %f", a,b);
        
        //FOR TAKING INPUT: (For using this comment out upper code)
        Scanner sc = new Scanner(System.in);
        String sister = sc.nextLine();
        System.out.println("Enter your sister's name: ");
        System.out.println(sister);
        
    }
    
}

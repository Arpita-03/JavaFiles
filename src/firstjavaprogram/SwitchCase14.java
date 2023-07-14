package firstjavaprogram;
import java.util.Scanner;

public class SwitchCase14 {

    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
    int age = sc.nextInt();
    
    switch(age){
        case 1:
            System.out.println("You are infant");
        break;
        case 13:
            System.out.println("You are now teenager");
            break;
        case 18:
            System.out.println("You are going to become adult now");
            break;
        case 60:
            System.out.println("You are old");
            break;
        default:
            System.out.println("It's just stages of life!");
            
            
    //Variable can be integer,character or string:
            /*
            char alpha = 'i';
    
            switch(age){
                case r:
            System.out.println("this is letter r");
            break;
                case p:
            System.out.println("this is letter p");
            break;
                case i:
            System.out.println("this is letter i");
            break;
                case t:
            System.out.println("this is letter t");
            break;
            default:
            System.out.println("Alphabets");
    //Same for string:  
            String name = "Arpita";
            
            switch(name){
                case "Riddhi":
            System.out.println("Riddhi was my college friend");
            break;
                case "Siddhi":
            System.out.println("Siddhi was close to me");
            break;
                case "Nihar":
            System.out.println("Nihar was my school friend");
            break;
                case "Arpita":
            System.out.println("Hi, this is me!,");
            break;
            default:
            System.out.println("Names are meaningfull");
*/
    }
    }
    
}

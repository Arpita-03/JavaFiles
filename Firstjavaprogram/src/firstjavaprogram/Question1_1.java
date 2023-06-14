/*Write a programto calculate percentage of a given student in CBSE based exam. 
  His marks must be taken from the keyboard(Marks are out of 100)*/

package firstjavaprogram;
import java.util.Scanner;

public class Question1_1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ENTER THE MARKS OF ENGLISH");
        int a = sc.nextInt();
        System.out.println("Marks of English: " + a);
        
        System.out.println("ENTER THE MARKS OF MATHS");
        int b = sc.nextInt();
        System.out.println("Marks of Maths: " + b);
        
        System.out.println("ENTER THE MARKS OF HINDI");
        int c = sc.nextInt();
        System.out.println("Marks of Hindi: " +c);
        
        System.out.println("ENTER THE MARKS OF SOCIALSCIENCE");
        int d = sc.nextInt();
        System.out.println("Marks of SocialScience:" + d);
        
        System.out.println("ENTER THE MARKS OF SCIENSE");
        int e = sc.nextInt();
        System.out.println("Marks of Science: " +e);
        
        float f = ((a+b+c+d+e)/500.0f)*100;
        
        System.out.println("Percentage of student: ");
        System.out.println(f);
        
       
    }
    
}

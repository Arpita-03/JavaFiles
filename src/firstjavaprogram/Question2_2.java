/*
Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
 */
package firstjavaprogram;


public class Question2_2 {

   
    public static void main(String[] args) {
        //encrypt
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);
        //decrypt
        grade = (char)(grade - 8);
        System.out.println(grade);        
    }
    
}

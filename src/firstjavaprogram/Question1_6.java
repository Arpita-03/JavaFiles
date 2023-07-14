/*
 Write a program to calculate CGPA using marks of three subjects (out of 100)
 */
package firstjavaprogram;


public class Question1_6 {

    
    public static void main(String[] args) {
        float english = 64;
        float maths = 86;
        float physics = 92;
        float cgpa = (english + maths + physics)/30;   //operation between two integer is always integer
        System.out.println(cgpa);
    }
    
}

/*
   Calculate the average marks from an array containing marks of all students in physics using for-each loop.
 */
package firstjavaprogram;


public class Question6_4 {


    public static void main(String[] args) {
        int[] marks = {90,80,70,60,50};
        float sum = 0;
        for(int element: marks){
            sum = sum + element;       
        }
        System.out.println("The average of all students in physics is: " + sum/marks.length);  //Average = sum/total no. of student
        
    }
    
}

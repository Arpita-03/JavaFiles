/*
  Write a java program to print the elements of an array in reverse order
*/
package firstjavaprogram;


public class Question6_1 {

    
    public static void main(String[] args) {
        int[] employee = {1,2,3,4,5,6,7,8,9,10};
        
        for(int i=employee.length-1; i>=0; i--)
        {
            System.out.println(i);
        }
    }
    
}

/*
   Write a java program to find the minimum element in an array.
 */
package firstjavaprogram;


public class Question6_8 {

    
    public static void main(String[] args) {
        int[] arr = {3,11,6,30};
        int min = Integer.MAX_VALUE;
        for(int e:arr){
            if(e < min){
                min = e;
            }
        }
        System.out.println("The minimum element in an array is: " + min);
    
    }
    
}

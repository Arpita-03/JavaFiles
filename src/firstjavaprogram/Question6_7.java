/*
 Write a java program to find the maximum element in an array.
 */
package firstjavaprogram;


public class Question6_7 {

    
    public static void main(String[] args) {
        int[] arr = {3,11,6,30};
        int max = 0;
        for(int e:arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println("The maximum element in an array is: " + max);
    }
    
}

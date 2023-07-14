/*
  Write a java program to find whether an array is sorted or not.
 */
package firstjavaprogram;


public class Question6_9 {


    public static void main(String[] args) {
        boolean isSorted = true;
        int[] num = {23,28,24,26,29,21,25,22,27,30};
        for(int i=0; i<num.length-1; i++){
            if (num[i] > num[i+1]){
                isSorted = false;
                break;
            }
        }        
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }
    }
    
}

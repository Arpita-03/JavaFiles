/*
  Write a java program to reverse an array.
 */
package firstjavaprogram;


public class Question6_6 {

    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int l = arr.length;
        int temp;
        
         //greatest int for any number
        int n = Math.floorDiv(l, 2);
                
        for(int i=0; i<=n; i++){
            //Swap a[i] and a[l-1-i] 
            // a   b   temp
            //|3| |4| | |
            temp = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-1-i] = temp;
    }
    for(int element: arr){
        System.out.println(element);
    }
        
      
      
        
    }
        
}

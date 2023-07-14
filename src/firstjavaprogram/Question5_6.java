/*
Write a program to sum first n even numbers starting from 0 using while loop.
 */
package firstjavaprogram;


public class Question5_6 {

    
    public static void main(String[] args) {          
       int sum = 0;
        int num = 1;           //It is the natural number,which we test and increment in each iteration
        int count = 1;        //It is the loop variable,it stores the count of even numbers 
        while(count<=5){
            if(num%2 == 0){
                sum = sum +  num;
                count++;
            }
            num++;
        }
        System.out.println("Sum of first five even number is : "+sum);  
    }
    
}
     

/* Using FOR Loop    

       int sum = 0;                                         //2n=2*n
       int n = 5;                                    //first 5 even numbers
       for(int i=0; i<n; i++){
           sum = sum +(2*i);  
       }
        System.out.println(sum);

      





*/
/*

Write a program to print the following pattern
****
***
**
*

*/
package firstjavaprogram;


public class Question5_5 {

    
    public static void main(String[] args) {
        int n = 4;
        for(int i=n; i>0; i--){           //We have to print * in each outer iteration 
            for(int a=0; a<i; a++)
                {
                   System.out.print("*"); 
                } 
            System.out.print("\n");
        }
    }
    
}





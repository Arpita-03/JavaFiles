/*
 Write a program to find factorial of a given number using for loops.
 */
package firstjavaprogram;


public class Question5_9 {

    
    public static void main(String[] args) {    //By FOR Loop
        
        int fact= 1;
        int num = 5;                    //5!= 5*4*3*2*1  (n = n-1 * n-2* n-3.....1)
        for(int i=1; i<=num; i++){
            fact = fact*i;
            System.out.println("Factorial of 5 is : "+fact);
        
    
        }   
    }
   
}

/* by WHILE Loop

int fact = 1
int num = 5;
int i = 1;
    while(i<=num){
    fact = fact*1;
   i++;
    
}
System.out.println("Factorial of 5 is : "+fact);
*/
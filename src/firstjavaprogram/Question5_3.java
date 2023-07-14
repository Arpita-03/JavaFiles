/*
   Write a program to print first n odd numbers using a for loop.
 */
package firstjavaprogram;


public class Question5_3 {

    
    public static void main(String[] args) {
        
        for(int a=0; a<10; a++){                          //2n = Even Numbers = 0,2,4,6,8....
            System.out.println(2*a+1);                     //2n+1 = Odd Numbers =1,3,5,7,9....
        }
    }
    
}

/*
int n = 15;
for(int a=0; a<n; a++){                          //2n = Even Numbers = 0,2,4,6,8....
            System.out.println(2*a+1);                     //2n+1 = Odd Numbers =1,3,5,7,9....
        }
*/
/*
  Write a program to print multiplication table of a given number n.
*/

package firstjavaprogram;

public class Question5_7 {

    public static void main(String[] args) {
        int n=8;
        int sum = 0;
        for(int i=1; i<=10; i++){
            sum = sum + n*i;
            
            
        }
        System.out.println(sum);
    }
    
}

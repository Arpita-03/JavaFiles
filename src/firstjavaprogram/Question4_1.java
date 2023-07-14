/* 
What will be the output of the program:
  int a = 10;
if(a=11){
     System.out.println("I am 11");
    }
else{
     System.out.println("I am not 11");

 */
package firstjavaprogram;


public class Question4_1 {


    public static void main(String[] args) {
        int a = 10;
        
        if(a == 11){  //It will show error, we can't assign in if statement.use ==.
            System.out.println("I am 11");
        }
        else{
            System.out.println("I am not 11");
        }
    }
}

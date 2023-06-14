/*
  While Loop
 */
package firstjavaprogram;


public class WhileLoop16 {


    public static void main(String[] args) {
        int i = 1;                   //Created an integer and gave value as 1
        while(i<=5){                 //Condition is true, as 1 is less than 5
          System.out.println(i);     //Now if the condition is true,it will print the statement Once
          i++;                       /*Now i = 2 and it will again go to while loop and ask is condition is true,
                            and 2 is still less than 5....this process will continue until the condition will be false*/   
      } 
        System.out.println("Finished running while loop!");
    }
    
}

//THIS IS AN INFINTE WHILE LOOP
 /*
 While(true){
   System.out.println("This is an infinite loop");
}
*/
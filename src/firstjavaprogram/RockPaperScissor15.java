/*3
 Generate rock paper scissor
 */
package firstjavaprogram;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor15 {


    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 1-> Rock, 2-> Paper, 3-> Scissor"); // For Taking input from the user
        int userInput = sc.nextInt();
        
        int randomNum = ran.nextInt(3)+1;                            //Random number created by computer
        
        System.out.println("Your choice: " + userInput + ", Computer's Choice " + randomNum);
        
        
        //Game's Logic
        
        if(userInput == 1 && randomNum == 3 || userInput == 3 && randomNum == 1)
        {
            System.out.println("YOU WIN");
        }
        else if(userInput == randomNum)
        {
            System.out.println("DRAW");
        }
        else if(userInput == 3 && randomNum == 1 || userInput == 1 && randomNum == 2 || userInput == 2 && randomNum ==3)
        {
            System.out.println("COMPUTER WIN");
        }
        else{
            System.out.println("ENTER VALID INPUT!");
        }
    }
    
}

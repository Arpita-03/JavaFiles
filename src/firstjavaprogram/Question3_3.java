/*
Write a java program to fill in a letter template which looks like below:
  letter = "Dear <|name|> tranks a lot!"
  replace <|name|> with a string (some name)
 */
package firstjavaprogram;


public class Question3_3 {


    public static void main(String[] args) {
       String letter = "Dear Prachi, thanks a lot!";
       letter = letter.replace("Prachi", "Shreya");
       System.out.println(letter);
    }
    
}

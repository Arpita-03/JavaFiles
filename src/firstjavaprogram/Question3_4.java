/*
  Write a java program to detect double and triple spaces in a string.
 */
package firstjavaprogram;


public class Question3_4 {


    public static void main(String[] args) {
      String sentence = "This string contain double  and   triple spaces";
      System.out.println(sentence.indexOf("   "));
      System.out.println(sentence.indexOf("  "));
              }
    
}

/*
  Create an array of 5 floats and calculate their sum
 */
package firstjavaprogram;


public class Question6_2 {

    
    public static void main(String[] args) {
      /* float [] num = new float[5];                       1st WAY
        num[0] = 0.2f;
        num[1] = 1.2f;
        num[2] = 2.2f;
        num[3] = 3.2f;
        num[4] = 4.2f;
        float sum = num[0]+num[1]+num[2]+num[3]+num[4];
        System.out.println(sum);
       */
       
      
      //                                                     2nd WAY
       float[] num = {0.2f, 1.2f, 2.2f, 3.2f, 4.2f};
       float sum = 0;                                  //Crated a variable:sum, whose initial value will be 0 and as we iterate it will add numbers to it.              
       for(float element: num){                       //Using ForEachLoop
           sum = sum + element;
       }
           System.out.println("The value of sum is: "+sum);

    
    }
    
}

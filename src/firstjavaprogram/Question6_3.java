/*
  Write a program to find out whether a given integer is present in an array or not.
 */
package firstjavaprogram;


public class Question6_3 {

    
    public static void main(String[] args) {
        int[] even = {2,4,6,8,10};                                    //Created Array & allocated some numbers
        int num = 6;                                                  //Created variable=num and store the value 6 in it
        boolean isInArray = false;                                    //By default mentioned here that it is not present in array.But the number present in it,Now it need to proof this
        for(int element:even){                                        //For proving it,we will iterate this array.
            if(num==element){                                         //if num=element of array,
                isInArray = true;                                     //as soon as we got num = element we dont want it to check further,so will break the loop.
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is present in the array");
        }
        else{
            System.out.println("The value is not present in the array");
        }
    }
    
}

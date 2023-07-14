/*
 */
package firstjavaprogram;

public class ChangeIntArray28 {

    static void change1(int a){
        a = 98;
    }
    
    static void change2(int[] arr){
        arr[0] = 98;
    }
    
    public static void main(String[] args) {
        //int[] marks = {52,34,76,92,12,30};
        
        //Case 1: Changing the integer
        int x = 45;
        change1(x);
        System.out.println("The value of x after running change1 is: " + x);
        
        //Case 2: Changing the array        //When we write something = { }, it means here marks is refrence and store some address.
        int[] marks = {52,34,76,92,12,30};  //here address passes to change2 not object's copy, so we have address of this object.
        change2(marks);
        System.out.println("The value of x after running change1 is: " + marks[0]);
    }
    
}

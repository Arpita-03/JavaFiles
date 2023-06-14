
package firstjavaprogram;


public class Operators05 {

    
    public static void main(String[] args) {
        int a = 4;
        int b = 6 % a; //Modulo Operator
         // 4.8 % 1.1 Returns Decimal Remainder 
        System.out.println(b);
        
        int d = 6;
        d += 6;
        System.out.println(d);
        System.out.println(6==8); //= :Assignment operator and == :Comparison Operator and it returns output as true or false
        System.out.println(6>3 && 3==3); //Logical Operator 01
        System.out.println(6>3 && 3>5); //Logical Operator 02 will return false if one statement is false
        System.out.println(6>3 || 3>5); //Logical Operator 03 will return true even if one statement is true
        
    }
    
}


package firstjavaprogram;


public class Relational_Logical_Operators12 {


    public static void main(String[] args) {
  /*  
    //Realtional 0pertaor
    int pin = 450223;
    if (pin==450221){
        System.out.println("Yes, Pin is correct.");    
    }
    else{
        System.out.println("No,Pin does not match!"); 
    }
    */
    //Logcal Operator
    System.out.println("For logical AND:");
    boolean a = true;
    boolean b = false;
    boolean c = true;
    if (a && b && c)
    {
        System.out.println("Y");
    }
    else
    {
        System.out.println("N");  
    }
    //-----------x----------------------
    System.out.println("For logical OR:");
    boolean d = true;
    boolean e = false;
    boolean f = false;
    if (d || e || f)
    {
        System.out.println("Y");
    }
    else
    {
        System.out.println("N");  
    }
    //-----------x----------------------
    System.out.println("For logical NOT:");
    System.out.print("Not(D) is: ");
    System.out.println(!d);
    System.out.print("Not(E) is: ");
    System.out.println(!e);
    
   }  
}

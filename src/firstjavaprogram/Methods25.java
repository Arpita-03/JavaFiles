/*

Mechthod is function which is available in class.

SYNTAX:
datatype name(){

    //method body
}
:-datatype = what this function will return.
:-name = any identifier.
:-() = parameters.
:-return = 
:-static = if we directly calling any method inside the main method ie."public static void main",
           without making any object then we can only call "static" method
 */
package firstjavaprogram;


public class Methods25 {
    static int logic(int x, int y){  //Here "LOGIC" is another method //the value of a and b will be copied here ie. x=2 & y=3
        int z;                       
        if(x>y){
            z = x+y;
        }
        else{
            z = (x+y)*5;
        }   
        return z;
    }
    
    public static void main(String[] args) {   //Here "MAIN" is one method
       
        int a = 2;         //We can't repeat this logic for every 2 numbers, right?
        int b = 3;         //So will put this logic in a method.for that we need to create method.
        int c;             //Method is just like "Function" & function is nothing but a way to separate logic.
        /*if(a>b){
            c = a+b;
        }
        else{
            c = (a+b)*5;
        }
        */
        c = logic(a,b);    //Instead of above code we can write this.
                           //so it will understand that it have to apply "LOGIC" method to a & b
                           //and take value of c to wherever it is called.
                           //it means c = 25                   
        
                           
                           
        int a1 = 6;        
        int b1 = 3;
        int c1; 
        if(a1>b1){
            c1 = a1+b1;
        }
        else{
            c1 = (a1+b1)*5;
        }
        System.out.println(c);
        System.out.println(c1);
        
    }
    
}

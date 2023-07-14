/*
Static: Static method in a class is shared by all the objects
Void: When we don't want our method to return anything.
 */
package firstjavaprogram;


public class CallingMethod26 {
    static int logic(int x, int y){  //When we don't write anything before static means Access Modifier is default.
        
        int z;                       //This function is not associated with the class's object but associated with the class.
        if(x>y){
            z = x+y;
        }
        else{
            z = (x+y)*5;
        }   
        return z;
    }
    
    static void joke(){            //Void: it doesn't return anything.This method is shared by all objects of class @MethodOverloading27
        
        System.out.println("I invented a new word!\n"  +  "Plagiarism!");
    }
    
    public static void main(String[] args) {
        int a = 2;        
        int b = 3;
        int c;
        
        // Method invocation using object creation
        
        CallingMethod26 obj = new CallingMethod26();
        c = obj.logic(a, b);
        
        System.out.println(c); 
        joke();                         //Calling a method
    }
    
}

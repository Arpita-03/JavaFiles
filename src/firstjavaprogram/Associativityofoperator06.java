
package firstjavaprogram;


public class Associativityofoperator06 {

    
    public static void main(String[] args) {
        //Precendence
        int a = 5*3-4/2;
 //Highest precendence goes to * to /. They are then evaluated on the basis of left to right associativity.
        /*
        =15-4/2
        =15-2
        =13
        */
        System.out.println("a: " +a);
        
        
        //Associativity
        int b = 4/2-5*3; 
        /*
        =2-5*3
        =2-15
        =-13
        */
        System.out.println("b: " +b);
        
        //Quiz
        //01
        int x = 8;
        int y = 1;
        int c = x - y/2;
        System.out.println("c: " + c);
        //02
        int k = 1;
        int l = 2;
        int m = 4;
        int d = k*k - (4*l*m)/(2*l);
        System.out.println("d: " +d);
         //03
        int v = 4;
        int u = 2;
        int e = v*v - u*u;
        System.out.println("e: " +e);
        //04
        int p = 2; 
        int q = 6;
        int r = 2;
        int f = p * q-r;
        System.out.println("f: " +f); 
    }
    
}

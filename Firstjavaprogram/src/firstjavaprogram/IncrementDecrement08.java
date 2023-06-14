
package firstjavaprogram;



public class IncrementDecrement08 {

    
    public static void main(String[] args) {
        int i = 32;
        System.out.println(i++);
        //int a = i++; (first a is assigned i then i is incremented)(32)  
        System.out.println(i);
        System.out.println(++i);
        //int a = i++; (first b is incremented then i is assigned)(34)
        System.out.println(i);
        char ch = 'd';
        System.out.println(++ch);
        System.out.println(ch++);
        System.out.println(ch);
    }
    
}

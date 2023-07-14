/*
 Arrays
 */
package firstjavaprogram;


public class Arrays21 {

    
    public static void main(String[] args) {
        /*
        Classroom of 500 students - you have to store marks of these 500 students
          You have 2 options:
        1.Create 500 Variable
        2.Yse Arrays (Recommended)
        */
    //There are mainly 3 Ways to create an array in java     
    
    // 1.Declaration + Memory Allocation
    //int[] marks = new int[5];     
   
    
    // 2.Declaration and then memory allocation
    //int[] marks;                   
    //marks = new int [5];           
   
    // marks[0] = 100;                //Initialization/Setting values
    //marks[1] = 90;
    //marks[2] = 80;
    //marks[3] = 70;
    //marks[4] = 60;
    //marks[4] = 50;                 //We can overwrite any value of any index in array.
    //marks[5] = 40;                 //It will throw an error,because we can only access those value which we have allocated
        
    //System.out.println(marks[4]);   //Accessing values
        
    
    // 3.Declaration,Memory Allocation and initialization together
    
        int[] marks = {100,90,80,70,60};  //Declare + Initialize!
        System.out.println(marks[2]);
        
        
        
        
    }
    
}

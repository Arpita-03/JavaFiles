/*
ArrayLength= How many arrays it consist.
*/

package firstjavaprogram;

public class ArrayLength22 {

    public static void main(String[] args) {
        /*
        //floating point array
        float[] value = {50,40.5f,30.2f,20.2f,10.3f};
        System.out.println(value[0]);
        System.out.println(value.length);       //It will give length of an array
        
        //String array
        String[] name = {"Arpita","Siddhi","Nihar","Shreya"};
        System.out.println(name[2]);
        System.out.println(name.length);       //It will give length of an array 
         */
        
        //Int array
        int[] marks = {100, 90, 80, 70, 60};
        System.out.println(marks.length);       //It will give length of an array        

        //Displaying the Array (Naive way)
        System.out.println("Printing using Naive Way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        //Displaying the Array (For Loop)
        System.out.println("Printing using for loop");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(i + " : " + marks[i]);
        }
    }

}

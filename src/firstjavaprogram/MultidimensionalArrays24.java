
package firstjavaprogram;


public class MultidimensionalArrays24 {

    
    public static void main(String[] args) {
        int[]marks;                          //1-D Array
        int[][]flats;
        flats = new int[2][3];              //2-D Array
                    //2 rows //3 columns
        flats[0][0] = 101;                 //Ground floor,1st home          
        flats[0][1] = 102;                 //Ground floor,2nd home
        flats[0][2] = 103;                 //Ground floor,3rd home
        
        flats[1][0] = 201;                 //First floor,1st home
        flats[1][1] = 202;                 //First floor,2nd home
        flats[1][2] = 203;                 //First floor,3rd home
        
        
         //Displaying the 2-D Array (For Loop)
        System.out.println("Printing a 2-D array using for loop");
        System.out.println("The length of the Array is: " + flats.length);
        for (int i=0; i<flats.length; i++) {               //As we know the length of array is 2,ie.0 & 1.
            for (int j=0; j<flats[i].length; j++) {        //Also it is a 2-D Array so we need to display the inner array as well.(therefore,nested loop)
                System.out.print(i + " : " + flats[i][j]);
                System.out.print("  ");
            }
            System.out.println("");
        }
    }

}
    

//
//
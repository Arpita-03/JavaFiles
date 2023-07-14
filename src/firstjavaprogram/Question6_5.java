/*
   Create a java program to add two matrices of size 2 x 3.
 */
package firstjavaprogram;


public class Question6_5 {

    
    public static void main(String[] args) {
       //As it is two matrices so it is 2-D Array.
       
       int[][] mat1 = {{2, 4, 6},
                       {8, 10, 12}};
          
       int[][] mat2 = {{1, 3, 5},
                       {7, 9, 11}};
       
       int[][] result = {{0, 0, 0},
                         {0, 0, 0}};
       
       for(int i=0; i<mat1.length; i++){            //row number of time(2)
           for(int j=0; j<mat1[i].length; j++){     // column number of time(3)
               System.out.format("Setting value for i=%d and j=%d\n", i, j);
               result[i][j] = mat1[i][j] + mat2[i][j]; 
           }
       }
       //Printing the elements of 2-D Array
       for(int i=0; i<mat1.length; i++){            //row number of time(2)
           for(int j=0; j<mat1[i].length; j++){     // column number of time(3)
               System.out.print(result[i][j] + " ");
               result[i][j] = mat1[i][j] + mat2[i][j]; 
           }
           System.out.println("");                 //Prints a new line
       } 
       
    }

}
       
       
 
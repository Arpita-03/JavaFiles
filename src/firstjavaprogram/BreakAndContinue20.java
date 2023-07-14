
package firstjavaprogram;


public class BreakAndContinue20 {

    
    public static void main(String[] args) {                              //Using FOR Loop
        //Break and Continue using Loops                             
        /*
        for(int i=0; i<5; i++){
            
            if(i==2){
                System.out.println("Ending the loop");
                continue;                                                //For break,just replace the keyword 
            }
            System.out.println(i);
            System.out.println("Learning java");
        }
        */
        
       /*
            int i = 0;                                                      //Using While Loop
            while(i<5){
            System.out.println(i);
            System.out.println("Learning java");
            if(i==2){
                System.out.println("Ending the loop");
                break;
                }
            i++;
        */
       
       
       
       int i=0;                                                           //Using Do-While Loop
          do{
              i++;         //We put i++ above because when i=2,statement will be skipped so no other line would be print after continue keyword.
              if(i==2){
                System.out.println("Ending the loop");
                continue;  
                }
              System.out.println(i);
              System.out.println("Learning java");
              
          }
          while(i<5);
       
       
    }
  }
    
    


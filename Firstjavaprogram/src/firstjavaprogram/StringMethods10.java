package firstjavaprogram;

public class StringMethods10 {

    public static void main(String[] args) {
        //01.LENGTH
        String name = "Arpita";
        int value = name.length();
        System.out.println(value);
       
        
        //02.LOWERCASE
        String text = "This Function Will Convert All Uppercase Letter To Lowercase";
        String value1 = text.toLowerCase();
        System.out.println(value1);
        
        //03.UPPERCASE
        String text1 = "This Function Will Convert All Lowercase Letter To Uppercase";
        String value2 = text.toUpperCase();
        System.out.println(value2);
        
        //04.TRIM
        String nonTrimString = "   Arpita   ";
        System.out.println(nonTrimString);
        //We can do this in two ways:
        String trimmedString = "   Bhamre   ";
        System.out.println(trimmedString.trim());
        
        String trimmedString1 = trimmedString.trim();
        System.out.println(trimmedString1);
        
        //05.SUBSTRING(INT START)
        String color = "White";
        System.out.println(color.substring(2));
        
        //06.SUBSTRING(INT START,INT END)
        String sister = "Prachi";
        System.out.println(sister.substring(0, 4));
        
        //07.REPLACE
         String name1 = "Arpita";
         System.out.println(name1.replace('r'/*old char*/, 'p'/*new char*/));
         System.out.println(name1.replace("rp"/*target*/, "nk"/*replacement*/));
         
        //08.STARTS WITH
        System.out.println(name.startsWith("Ar"));
        
        //09.ENDS WITH
        System.out.println(name1.endsWith("fa"));
        
        //10.CHAR AT
        System.out.println(name1.charAt(3));
        
        //11.INDEXOF
        System.out.println(name1.indexOf("t"));
        
        //12.INDEXOF("I", 3)
        String modifiedname = "Arprpita";
        System.out.println(modifiedname.indexOf("rp", 3));   
        
        //13.LASTINDEX("t")
        String newname = "Arpitita";
        System.out.println(newname.lastIndexOf("i"));
        
        //14.LASTINDEX("t", 4)
        System.out.println(newname.lastIndexOf("i", 4));
        
        //15.EQUALS("Arpita")
        System.out.println(name1.equals("Arpita"));
        System.out.println(name1.equals("arpita")); 
        
        //16.EQUALS IGNORE CASE
        System.out.println(name1.equalsIgnoreCase("arPita"));
         
        //ESCAPE SEQUENCE CHARACTERS:
        System.out.println("I am escape sequence \" double quotes");
        
         
         
        
    }
    
}

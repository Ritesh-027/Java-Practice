package Strings;

import java.util.*;

public class Strings {
    /**
     * @param args
     */
    public static void main(String args[]){
        //Declaring a string.

        // String name = "Ritesh";
        // System.out.println(name);

        //Concatenation of string.

        // String firstname = "Shefali";
        // String lastname = "Kadam";
        // String fullname = firstname+" "+lastname;
        // System.out.println(fullname);

        //Getting a substring from a main string.

        // String sent = "Shefali you are a great girl!";
        // String subString = sent.substring(0, 23);
        // System.out.println(subString);
        
        //Comparing a string.
        
        // String s1 = "Ritesh";
        // String s2 = "Ritesh";

// -Type - 3 - Comparing a string. - Storing type are different from object - Its a function!

// -Type 1 - Comparing a string.

        // int comp = s1.compareTo(s2);
        // System.out.println(comp);

// -Type 2 - Comparing a string. - Some time its giving a wrong result or its failed!

        // if(comp == 0){
        //     System.out.println("Both strings are equal");
        // }else{
        //     System.out.println("Strings are not equal! ");
        // }


            // String str = "Obeviously you are beutiful! Shefali !";
            // String st1 = "Obeviously you are cute! Shaysha !";

            // char print = str.charAt(13);
            // System.out.println(print);

            //String length!
            
            // int len = str.length();
            // System.out.println(len);

            //Printing each character of string.
            // for(int i = 0; i<str.length(); i++){
            //     System.out.print(str.charAt(i)+" ");       
            //   }

            //String as object - Non Primitive data type!

// -Type - 3 - Comparing a string. - Storing type are different from function - Its a object!

            if(new String("Obeviously you are beutiful! Shefali !") == new String("Obeviously you are beutiful! Shefali !")){
                System.out.println("Both are equal");
            }else{
                System.out.println("Both are not equal !");
            }


    }
    
}


// Strings are immutable so it cannot be changed. Every time it create's a new string for modification.

public class String_Exmples{
    public static void main(String args[]){

        // // String converting into lowercase.
        // String name = "RITESH";
        // System.out.println(name.toLowerCase());

        // // String converting into uppercase.
        // String name1 = "ritesh";
        // System.out.println(name1.toUpperCase());
 
        // // Replcing a string letter.
        // String name2 = "Shefali is arrogant";
        // System.out.println(name2.replace("is", "is not"));
 

        // // Replcing a string character.
        // String name3 = "Ritesh loves shefali!";
        // System.out.println(name3.replace('R', 'H'));

        // // // Getting index of letter.
        // // String name4 = "Ritesh loves shefali!";
        // // System.out.println(name4.indexOf("shefali!"));

        // //Getting index of character.
        // String name5 = "Ritesh loves shefali!";
        // System.out.println(name5.indexOf('l'));

        // //Applaying indentation to the string.
        // String name6 = "Ritesh loves shefali!";
        // System.out.println(name6.indent(5));

        // //Detecting Single, Double and Triple spaces from the string .
        // String myString = "Ri tesh  loves shefali   !";
        // System.out.println("Single space detected at index no : "+myString.indexOf(" "));
        // System.out.println("Double space detected at index no : "+myString.indexOf("  "));
        // System.out.println("Triple space detected at index no : "+myString.indexOf("   "));

        // Using escape sequence characters.
        // String str =  "Dear shefali,\n\t First and last love is you! ";
        // System.out.println(str);

        String str1 =  "Dear Shefali, First and last LOVE is \ryou! ";
        System.out.println(str1);



    }
}
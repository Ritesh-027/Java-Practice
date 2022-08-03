// We can modify the string using string builder class in java.

package Strings;

import java.rmi.StubNotFoundException;

public class StrBuilder {
    public static void main(String args[]){

        // Declaring a string builder class.
        StringBuilder sb = new StringBuilder("Ritesh loves shefali ! That's it.");
        System.out.println(sb);

        // Getting a length of string.
        System.out.println(sb.length());

        //Inserting a new string into the existing string.
        sb.insert(0, "Shefali loves ritesh - & ");
        System.out.println(sb);        

        //Setting a character into the existing string index.
        sb.setCharAt(0,'R');
        System.out.println(sb);

        //Deleting a string into existing string.
        sb.delete(0, 7);
        System.out.println(sb);

        //Inseting a character into the existing string's index number.
        sb.insert(1, 's');
        System.out.println(sb);

    }
    
}

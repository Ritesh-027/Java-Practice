package Functions;
import java.util.*;

public class firstFunc {
    
    //Making a function for - Taking input from user and print.
    public static String printName(String name){
        System.out.println();
        System.out.println("Submitted name is : "+ name);
        return name;
    }

    public static void main(String[] args){

        //This is for taking input from user.
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        printName(name);//Calling function in main method!
        
    }
    
}

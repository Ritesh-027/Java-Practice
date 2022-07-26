package Functions;
import java.util.*;

public class Factorial{

    //function for getting a factorial number from the user input.
public static void fact(int n){
    int f = 1;
    
    //loop for inverse multiplaying a number.
    for(int i=n; i>=1; i--){
        f = f * i;
    }
        System.out.print(f);
        return;
    }

//Main Function    
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    fact(n);//Calling factorial function in the main function.
    }

}

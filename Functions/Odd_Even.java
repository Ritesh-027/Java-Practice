package Functions;
import java.util.Scanner;
public class Odd_Even {
    public static void main(String[] args){
        System.out.println("Give your number to check Even & Odd :");
        Scanner EO = new Scanner(System.in);
        int input = EO.nextInt();
        checkEvnOdd(input);
    }
    public static void checkEvnOdd(int n){
        if(n % 2 == 0){
            System.out.println("Given number is even :"+n);
        }else{
            System.out.println("Given number is odd :"+n);
        }

    }
    
}

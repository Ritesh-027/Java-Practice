package Functions;

import java.util.Scanner;
// Function of 2 number addiion.
public class funcof2num {
    public static void main(String args[]){
        Scanner sum = new Scanner(System.in);
        int a = sum.nextInt();
        int b = sum.nextInt();
        int both = sumofTwo(a, b);
        System.out.println(both);
    }
    
    public static int sumofTwo(int a, int b){
        int c = a + b;
        return c;
    }
}

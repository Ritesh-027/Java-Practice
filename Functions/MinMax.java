package Functions;

import java.util.Scanner;

public class MinMax{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //Calling function in main method!
        MnM(a, b, c);
    }

    public static void MnM(int a,int b,int c){

        // Using math function getting a min & max values of given user 3input.
        int min = Math.min(a,b);
        int finMin = Math.min(min,c);
        System.out.println("Min value of given inputs are :");
        System.out.println(finMin);
        System.out.println();
        System.out.println("Max value of given inputs are :");
        int max = Math.max(a, b);
        int fmax = Math.max(max,c);
        System.out.println(fmax);

    }
}
package Loops;

import java.util.*;

public class Loops {
public static void main(String[] args){
    //First pattern code by myself.
    // Printing rectangle pattern depend on user inputs.

    Scanner inp = new Scanner(System.in);
    int a = inp.nextInt(); 
    int b = inp.nextInt(); 

    for(int i=1;i<=a;i++){     
        for(int j=1;j<=b;j++){
                System.out.print("*");
                }
            System.out.println();
        }
    } 
}
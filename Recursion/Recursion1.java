package Recursion;

public class Recursion1 {
    public static void main(String args[]){
    
        int n=1;
        System.out.println("Print 10 to 1 with recursion!");
        printNum(n);
    
    }
    public static void printNum(int n){
        if(n == 11){
            return;
            }
        System.out.println(n);
        printNum(n+1);
    }
}

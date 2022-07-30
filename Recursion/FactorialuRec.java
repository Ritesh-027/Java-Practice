package Recursion;

public class FactorialuRec {
    public static void main(String args[]){
        int n = 5;
        System.out.println(factorial(n)); 
    }
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n* factorial(n-1);
    }
    
}
// Code error solve after 1.5 hour.
package Recursion;

public class CalcFact {
    public static void main(String args[]){
        System.out.println("Factorial of given number :");
        int n = 6;
        int result = findFacto(n);
        System.out.println(result);
    }
    
    // Recursion function of printing factorial of n;
    public static int findFacto(int n){
        if(n==0 || n==1){
            return 1;
        }
        int formula = findFacto(n-1);
        int finalFormula = n*formula;
        return finalFormula;
    }
}

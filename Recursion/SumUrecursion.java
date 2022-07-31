package Recursion;

public class SumUrecursion {
    public static void main(String args[]){
        sumofn(1, 5, 0);
    }
    public static void sumofn(int i,int n,int sum){
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum +=i;
        sumofn(i+1, n, sum);
    }
    
}

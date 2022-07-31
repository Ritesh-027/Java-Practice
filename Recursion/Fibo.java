// Code not understand after seeing 1 hr with googling!

package Recursion;

public class Fibo {
    public static void main(String args[]){
        for(long i=1; i<=9; i++){ 
            System.out.println(fibcci(i) +" "); 
          }
          System.out.println();

    }

    public static int fibcci(long i){
        if (i == 1 || i == 2) {
            return 1;
        }`
          return fibcci(i - 1) + fibcci(i - 2);
    }
}

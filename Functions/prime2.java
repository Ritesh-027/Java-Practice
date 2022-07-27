package Functions;

import java.util.*;
public class prime2{
    public static void main(String[] args){
        Scanner prime = new Scanner(System.in);
        int n = prime.nextInt();
        prime(n);
    }

public static void prime(int n){

    for(int i=2; i<=n; i++){

        if(n % i == 0){
                System.out.println("Given number is not prime: " + n);
        }else{
                System.out.println("Given number is prime :" + n);
                }
    }
}

    
}
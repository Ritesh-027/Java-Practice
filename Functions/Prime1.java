package Functions;
import java.net.SocketTimeoutException;
import java.util.*;

public class Prime1 {
    public static void main(String[] args){
        System.out.println("Input number is :");
        Scanner scan = new Scanner(System.in);
        int take = scan.nextInt();
        prime(take);
    }
        public static void prime(int n){

            for(int j=1; j<=n; j++){
            int a = 0;    
                for(int i=2; i<=j; i++){
                    if(j % i == 0){ 
                        a++;
                    }
                }
                if(a == 1){
                    System.out.println(j);
                }
            }
        }   
    }

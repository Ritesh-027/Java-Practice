package Loops;

public class ptn1{

    public static void main(String[] args){
        for(int i=1; i<=5; i++){
            
            for(int j=1; j<=5-i+1;j++){
            
                System.out.print(j);
            
                }
            System.out.println();
        }
  

        int n=5;
        int num=1;
        for(int i=1; i<=n; i++){
            
            for(int j=1; j<=i; j++){
            
                System.out.print(num+" ");
                num++;
            }

            System.out.println();
        }

    }
}
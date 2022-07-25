package Loops;

public class SqrWithAlpha {
    public static void main(String[] args){

        int n = 5;
        int alpha = 65;

        for(int i=1; i<=n; i++){

            for(int j=n; j>=i; j--){
                System.out.print((char) alpha + " ");
            }

            for(int k=1; k<=i;k++){
                System.out.print((char) (alpha+i-1) + " ");
            }

            System.out.println();
        }
    }
    
}

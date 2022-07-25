package Loops;

public class AlphaHPY {
    public static void main(String[] args){
        int n=6;
        int alpha = 65;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char) (alpha+j-1)+" ");
            }
            System.out.println();
        }

        for(int i=5; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print((char) (alpha+j-1)+" ");
            }
            System.out.println();
        }
    }
}

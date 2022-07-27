package Loops;

public class ArrowWithAlpha{

    public static void main(String[] args) {
        int alphabet = 65;

        for(int i=1; i<=5;i++){
            
            for(int j=1; j<=i+1;j++){
                System.out.print(" ");            
            }
            for(int j=1; j<=1;j++){
                System.out.print((char) alphabet);
                alphabet++;
            }
            System.out.println();
        }
        for(int i=1; i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(" ");    
            }
            for(int j=1;j<=1;j++){
                System.out.print((char) alphabet);
                alphabet++;
            }

            System.out.println();   
        }
    }
}


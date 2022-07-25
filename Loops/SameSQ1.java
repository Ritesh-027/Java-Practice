package Loops;


public class SameSQ1 {
    public static void main(String[] args){
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i == 1 && j == 1 || i == 2 && j == 2 || i == 3 && j == 3 || i == 4 && j == 4 || i == 5 && j == 5 ){
                System.out.print(j);
                }else{
                    System.out.print(0);
                }
            }
            for(int k=n; k>i; k-- ){
                System.out.print("0"); 
             }
            System.out.println();    
        }
        
            
    }
    
}

public class Butterfly{
    public static void main(String[] args){
 
        int n=4;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
    
            int spaces = 2 * (n-i);
        
            //2 * (4-1) = 6
            //2 * (4-2) = 4
            //2 * (4-3) = 2
            //2 * (4-4) = 0

            for(int j=1; j<=spaces;  j++){
                System.out.print(" ");
            }
    
            for(int j=1; j<=i; j++){
                System.out.print("*");
                }
                System.out.println();
            }
            
            for(int i=n; i>=1; i--){
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
        
                int spaces = 2 * (n-i);
            
                //2 * (4-1) = 6
                //2 * (4-2) = 4
                //2 * (4-3) = 2
                //2 * (4-4) = 0
    
                for(int j=1; j<=spaces;  j++){
                    System.out.print(" ");
                }
        
                for(int j=1; j<=i; j++){
            
                    System.out.print("*");
            }
                    System.out.println();
        }
    }
}

    

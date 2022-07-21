public class Patterns_Practice{
public static void main(String[] args){

    //All the paterns for practice!
    
            System.out.println("Solid Rectangle!");

    for(int i=1;i<=4;i++){
        for(int j=1;j<=5;j++){
            System.out.print("*");
            }
        System.out.println();
        }

    
            System.out.println("Hollow Rectangle!");

    for(int i=1;i<=5;i++){
        for(int j=1; j<=6; j++){
            if(i==1 || j==1 ||i==5 ||j==6 ){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
            System.out.println();
        }

            System.out.println("Half Pyramid!");

    for(int i=1; i<=5; i++){
        
        for(int j=1; j<=i; j++){
           
            System.out.print("*");
        }
        System.out.println();
    }

            System.out.println("Inverted Half Pyramid!");

        for(int i=5; i>=1; i--){
                  for(int j=1; j<=i; j++){
                      System.out.print("*");
            }
                System.out.println();
        }

            System.out.println("180 Degree Inverted Half Pyramid !");
            int n = 5;
            for(int i=1; i<=n; i++){
                
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
                
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }

    }

}
public class Palindrom{
    public static void main(String[] args){
                int m=4;
    for(int i=1; i<=m; i++){
                    
        for(int k=1; k<=m-i; k++){
            System.out.print(" ");
                    }
        for(int j=i; j>=1; j--){
            System.out.print(j);
                    }
        for(int j=2; j<=i; j++){
            System.out.print(j);
                    }
            System.out.println();
        }
    }
}
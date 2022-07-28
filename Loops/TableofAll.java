public class TableofAll{
    public static void main(String[] args){
        int table = 0;
        for(int i=1;i<=10;i++){
            System.out.println();
            System.out.println("Table of "+i+" is below :");
            System.out.println();
            for(int j=1; j<=10; j++){
                    table = i*j;
                    System.out.println(i +" * "+ j+" = "+table); 
                }
            }
        }
    }
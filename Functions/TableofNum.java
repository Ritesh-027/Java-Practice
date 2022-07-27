package Functions;
import java.util.*;
public class TableofNum {
    public static void main(String[] args){
        System.out.println("Input number is :");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("Table is printed below :");
        table(num);
    }
    
    public static void table(int n){
        int sum = 0;
        for(int i=1; i<=10; i++){
            sum = i * n;
            System.out.println(n + " * " + i +" = " + sum );
        }
    }
}
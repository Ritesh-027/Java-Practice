package Functions;
import java.util.*;

//New function for sum.
public class Sumof2Num {
    
    public static int sumOf2num(int a,int b){
        int sum = a + b;
        return sum;
    }
  
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);//Taking a input from user.
        int a = sc.nextInt();//Taking a int value from the user - input 1;
        int b = sc.nextInt();//input 2
        int sum = sumOf2num(a, b); //Calling the function and storing it in a sum variable.
        System.out.println();
        System.out.println("Sum Of Given Number :"+ sum);
       
    }
    
}

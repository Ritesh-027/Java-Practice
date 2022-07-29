package Functions;

public class Fibo2 {
    public static void main(String args[]){
        // Printing fibonacci serries from 0 to 100.
        int n = 15;
        int firstNum = 0;
        int secondNum = 1;
        
        System.out.println("Fibonacci series of 0 to -"+ n +" : ");
        System.out.println();
        
        for(int i=0; i<=n; i++){
            
            System.out.print(firstNum+", ");

            //Formula of fibonacci series!
            int fiboSum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = fiboSum;
        }
        System.out.println();
    }
    
}

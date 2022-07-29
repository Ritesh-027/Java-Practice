package Functions;

public class Fibonacci {
    public static void main(String args[]){

    //Fibonacci series -> previews 2 numbers sum.

    int n = 10, 
    firstTerm = 0, 
    secondTerm = 1;
    System.out.println("Fibonacci Series till " + n + " terms:");

                for (int i = 1; i <= n; ++i) {
                
                System.out.print(firstTerm + ", ");

                //compute the next term
                int nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;    
                
                }
            }
        }

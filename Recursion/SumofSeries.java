package Recursion;

public class SumofSeries{
    public static void main(String args[]){
        int number = 100;
        long sumOfAllNumbers = sumOfAllNumbers(number);
        System.out.println(sumOfAllNumbers);
          
    }
 
    /* A recursive sum of all natural numbers up to a given long. */
    public static long sumOfAllNumbers(long number) {
    /* Stop the recursive Java program at zero */
      if (number != 0) {
        return number + sumOfAllNumbers(number - 1);//(10-1) = 9
      } else {
        return number;
      }
    }
  }

//How recursive function works !

//- Function will take an input from the main function whtevr it is.
//- Then this input will go in a recursive function.
//- Then input will be checked with its base case
//- Then function will run accordingly and stop once base case condition wrong.
//- Recursive function will call from the main method.
//- Outer function will run till the condition is true.
//- Then inner function will call the outer function till condition is not wrong.

package Functions;

class CheckIfPrime {
  
    static boolean isPrime(int n)
    {
        //We cannot check the negetive number that's why this condition!
        if (n <= 1)
            return false;// Return and exit from the function and set to the initial stage.
        
            //Checking if the given number is prime or not!

        for (int i = 2; i < n; i++) //loop for checking that n is divided by any of the number from 1 to n!
            if (n % i == 0)
                return false;
  
        return true;
    }
 
    public static void main(String args[])
    {
        if (isPrime(11)) // Calling function and printing the result here!
            System.out.println(" true");
        else
            System.out.println(" false");
        if (isPrime(2))
            System.out.println(" true");
        else
            System.out.println(" false");
    }
}
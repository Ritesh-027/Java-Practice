package BitManupulation;

// Counting a setBits from the given integer number in a binary representation.

public class countSetBits {
    /* Function to get no of set
    bits in binary representation
    of positive integer n */
    static void countSetBits(int n)
    {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1; 
        }
        //return count;
        System.out.println(count);    
    }
    // Calling function in main method.
    public static void main(String args[])
    {
        int i = 15;
        countSetBits(i);
    }
}
 
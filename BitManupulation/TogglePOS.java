//Write a program to toggle a bit a position = “pos” in a number “n”.

package BitManupulation;

import java.util.Scanner;

    public class TogglePOS {
        public static void main(String[] args) {

            //Toggle means opposite site of given number if press 0 then output should pe 1 and vice-versa.

            Scanner sc = new Scanner(System.in);
            int n=5;
            int pos = sc.nextInt();
            int bitmask= 1<<pos; //if pos 2 then 0100
            int newNumber = bitmask ^ n; // 0100 ^ 0101 = 0001 -> 1 will be output
            System.out.println(newNumber);
        }
    }

package BitManupulation;

import java.util.Scanner;
//Updating a 2nd bit.
public class UpdateBit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int opration = sc.nextInt();
        
        int n = 5;
        int pos = 2;
        int bitMask =  1<<pos;
        
        // Updating as per given operation.
        if(opration == 1){ 
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }else{
            int notBit = ~(bitMask);
            int newNumber = bitMask & n;
            System.out.println(newNumber);
        }
        // int bitMask = 1<<pos;
        
        //Set bit
 /*        int setBit = bitMask | n;
        System.out.println(setBit);
 */

        //Update bit.
        // int notBit = ~(bitMask);
        
        // int andOp = notBit & n;
        // System.out.println(andOp);



    }
    
}

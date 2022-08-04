package BitManupulation;
//Get-bit mask
public class BitExmpls {
    public static void main(String args[]){

        //Get the 3rd bit.
        int n = 5; //0101 - > Binary conversion of five.
        int pos = 3;
        int bitMask = 1<<pos; //-> 1 left shift 2.

        // AND operation and if both operation result is 0 or 1 then printing the value accordingly.
        if((bitMask & n) == 0){
            System.out.println("Bit was zero");
        }else{
            System.out.println("Bit was one");
        }


    }
    
}

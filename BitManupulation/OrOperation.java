package BitManupulation;

public class OrOperation {
    public static void main(String args[]){
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;

        //Set-Bit mask
        int newNumber = bitMask | n;
        System.out.println(newNumber);
        

    }
    
}

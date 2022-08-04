package BitManupulation;

public class ClearBit {
    public static  void main(String args[]){
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;
        int notBitMask = ~(bitMask);

        int andBitmask = notBitMask & n;
        System.out.println(andBitmask);

    }
    
}

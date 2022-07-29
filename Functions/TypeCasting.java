package Functions;

public class TypeCasting {
    public static void main(String args[]){
        //Widening casting from int to double data table. In Widening casting its changed automatically.

        int x = 7;
        double mydbl = x;
        System.out.println(mydbl);

        //Narrowing casting from large to small.
        double mYdbl = 45678.456;
        int mYY = (int) mYdbl;
        System.out.println(mYY);
    }
    
}

public class ArrayStart{
    public static void main(String args[]){
        //One -D creating a array!
//        int[] oneDarray = new int[5];

        //Two - D creating a array!
//s        int[][] twoDarray = new int [2][3];

        //Defining array way 1!
        int[] oneDarray = new int[5];

        oneDarray[0] = 10;
        oneDarray[1] = 20;
        oneDarray[2] = 30;
        oneDarray[3] = 40;
        oneDarray[4] = 50;

    //System.out.println(oneDarray[3]);

        //Accessing the array data with loop.
        for(int i=0; i<oneDarray[0]; i++){
            System.out.println(oneDarray[i]);
        }

    }
}
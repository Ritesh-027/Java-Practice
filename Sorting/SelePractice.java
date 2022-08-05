package Sorting;

public class SelePractice{
    public static void printSort(int ary[]){
        for(int i=0; i<ary.length; i++){
            System.out.println(ary[i]+" ");
        }
    }
    public static void main(String args[]){
        int ary[] = {2,15,1,2,10,0,500,650,5846};

        //Sort the array with the selection sort technique.

        for(int i=0; i<ary.length; i++){
            int minValue = i;
            for(int j=i+1; j<ary.length; j++){

                if(ary[j] < ary[minValue]){
                    minValue = j;
                }
            }
            int temp = ary[minValue];
            ary[minValue] = ary[i];
            ary[i] = temp;
        }
        printSort(ary);
    }

}
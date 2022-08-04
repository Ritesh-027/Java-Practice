package Sorting;

public class BubbleSortTech {
    public static void BubbleSort(int ary[]){
        
        //for printing the sorted values.
        System.out.print("Sorted array is : ");
        for(int i=0; i<ary.length; i++){
            System.out.print(ary[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String args[]){
        //Declaring a array
        int ary[] = {7,8,2,3,5,6,9,10};

        // Bubble sorting technique.
        for(int i=0; i<ary.length; i++){
            for(int j=0; j<ary.length-i-1; j++){
                if(ary[j] > ary[j+1]){
                    
                    //Swap the values.
                    int temp = ary[j];
                    ary[j] = ary[j+1];
                    ary[j+1] = temp;
                }
            }
        }
        BubbleSort(ary);
     }
}

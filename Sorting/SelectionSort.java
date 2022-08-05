package Sorting;

public class SelectionSort {
    public static void SelecSort(int ary[]){
        
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
        for(int i=0; i<ary.length-1; i++){
            int small = i;
            for(int j=i+1; j<ary.length; j++){
                if(ary[small] > ary[j]){
                    small = j;
                }
            }
            int temp = ary[small];
            ary[small] = ary[i];
            ary[i] = temp;
        }

        SelecSort(ary);
     }
}

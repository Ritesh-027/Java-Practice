public class Ins_Practice {
    public static void main(String args[]){
        int ary[] = {10,100,1,150,2,200,1000,999,998,997};

        // Sort above array using insertion array.
        int temp,j; // Storing temp value and initialization of second loop.

        for(int i=1; i<ary.length;i++){// First loop for counting array element.

            temp = ary[i]; // Storing 1st value of array to the temp variable.

            j=i; // Starting second loop from 1;

            while(j > 0 &&  ary[j-1] > temp)
            { // Comparing if 0th index value of array is higher than 1st index! 
                // [Ascending order] 
                
                ary[j] = ary[j-1]; // Then assing 0th value to the 1st index for sorting.
                
                j = j-1; // Decreasing the loop. 
            }
            ary[j] = temp; // if condition is false than values stayed of same place.
        }

        //Printing the sorted array.
        System.out.print("Sorted array by INSERTION SORT : ");
        for(int i=0; i<ary.length; i++){
            System.out.print(ary[i]+" ");
        }
    }
    
}

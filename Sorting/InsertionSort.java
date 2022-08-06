public class InsertionSort{
    public static void main(String args[]){
        int a[] = {1,5,0,4,2,3};

        //In insertion loop will start from index 1.
        int temp, j;
        for(int i=1; i<a.length; i++)
        {
            temp = a[i];
            j=i;
            while(j > 0 && a[j-1]>temp)
            { //1 > 0 and 1 > 5 false.
                a[j] = a[j-1]; // 1 = 5
                j=j-1;
            }
            a[j] = temp; //5 = 5
        }

    for(int i=0; i<a.length; i++)
    {
        System.out.println(a[i]+" ");
       }

    }

}
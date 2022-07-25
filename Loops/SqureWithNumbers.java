public class SqureWithNumbers{
    public static void main(String[] args){
    
    int N = 4, i, j, min;
    System.out.println("Value of N: " + N);
  
    for (i = 1; i <= N; i++) 
                {
        for (j = 1; j <= N; j++) 
                    {
                min = i < j ? i : j;
                System.out.print(N - min + 1);
            }
            System.out.println();
        }
    }
}
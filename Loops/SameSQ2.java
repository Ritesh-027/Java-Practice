package Loops;

public class SameSQ2 {
	public static void main(String[] args)
	{
		int rows = 5;
		System.out.println("## Printing the pattern ##");
		for (int i = 1; i <= rows; i++)
		{
			for (int j = 1; j < i; j++)
			{
				System.out.print("0 ");
			}
			System.out.print(i + " ");
			for (int k = i; k < rows; k++)
			{
				System.out.print("0 ");
			}
			System.out.println();
		}
	}
}

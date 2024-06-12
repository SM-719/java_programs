import java.util.Scanner;
class Pattern10
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

		for (int i = 0 ; i < n ; i++ )
		{
			for (int star =	0 ; star <= i ; star++)
			{
				System.out.print("*");
			}
			for (int space = n-1 ; space >i ; space--)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}

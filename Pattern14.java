import java.util.Scanner;
class Pattern14
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

		for (int i = 0; i < n ;i++ )
		{
			for (int space = 0; space < n -1-i ; space++ )
			{
				System.out.print(" "+" ");
			}
			for (int star = 0 ; star>n-i ;i++ )
			{
				System.out.print("*"+" ");
			}
			
			System.out.println();
		}
	}
}

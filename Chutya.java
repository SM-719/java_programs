import java.util.Scanner;
class Prim
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();

		int deno = 2;

		while (deno<num)
		{
			if (num % deno == 0)
			{
				System.out.println("It is not a Prime number");
				break;
			}
			deno++;
		}
		if(deno == num)
		{
			System.out.println("It is a Prime Number");
		}
	}
}
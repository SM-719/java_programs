import java.util.Scanner;
class primeno
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		if (isprime(num))
		{
			System.out.println("Number is prime");
		}
		else
		{
			System.out.println("The numner is not a prime");
		}
	}
	public static boolean isprime(int num)
	{
		 int deno = 2;
		 while (deno < num)
		 {
			 if (num % deno ==0)
			 {
				 break;
			 }
			 deno++;
		 }
		 if (deno == num)
		 {
			 return true;
		 }
		 else
		{
			return false;
		}
	}
}
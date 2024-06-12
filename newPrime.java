import java.util.Scanner;
class newPrime
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		int rev = reverse(num);

		if(isPrime(num))
		{

			if(isPrime(rev))
			{
				System.out.println("The number is Twistedprime");
			}
			else
			{
				System.out.println("The number is prime but reverse of that number is not prime");
			}
		}
		else
		{
			if(isPrime(rev))
			{
				System.out.println("The number is not prime but the reverse of that number is prime");
			}
			else
			{
				System.out.println("The number is not prime and the reverse of that number is also not prime");
			}
		}
	}
	public static boolean isPrime(int num)
	{
		int deno =  2;
		while (deno < num)
		{
			if (num % deno == 0 )
			{
				break;
			}
			deno++;
		}
		if (num == deno)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static int reverse(int num)
	{
		int no = num;
		int reverse = 0;
		while (no != 0)
		{
			int sum = no % 10; //21
			reverse = reverse * 10 + sum;
			no/=10;
		}
		return reverse;
	}
}
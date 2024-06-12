import java.util.Scanner;
class DigitsSumPrime
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int num = sc.nextInt();
		int sum = 0;

		while (num !=0)
		{
			int last = num % 10;
			sum += last;
			num /=10;
		}

		int deno = 2;

		while (deno < sum)
		{
			if (sum % deno == 0)
			{
				break;
			}
			deno++;
		}
		if (deno == sum)
		{
			System.out.println("The sum of digits of number is prime.");
		}
		else
		{
			System.out.println("The sum of digits of number is not prime.");
		}
	}
}
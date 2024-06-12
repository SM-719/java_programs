import java.util.Scanner;
class evenPalindrome
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check whether it is Palindrome or not");
		int num = sc.nextInt();
		
		if(isPalindrome(num))
		{
			if(isEven(num))
			{
				System.out.println("The number is EvenPalindrome!");
			}
			else
			{
				System.out.println("The number is Palindrome but not Even!");
			}
		}
		else
		{
			if(isEven(num))
			{
				System.out.println("The number is Even but not Palindrome!");
			}
			else
			{
				System.out.println("The number is not Even not Palindrome!");
			}
		}
	}

	public static boolean isPalindrome(int num)
	{
		int i = num ;
		int rev = 0;
		while (i != 0)
		{ 
			int sum = i % 10;
			rev = rev * 10 + sum;

			i/=10;
		}

		if(num == rev)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean isEven(int num)
	{
		if(num % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
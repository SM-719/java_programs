import java.util.Scanner;
class PalindromeEven
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check whether it is Twisted even or not");
		int num = sc.nextInt();

		int reverse = 0;

		for(int temp = num ; temp >0 ; temp/=10)
		{
			int last = temp % 10 ;
			reverse = reverse * 10 + last;
		}
		if(num % 2==0)
		{
			if (reverse % 2 ==0)
			{
				System.out.println("The number is Twisted Even");
			}
			else
			{
				System.out.println("The number is not Twisted Even");
			}
		}
		else
		{
			System.out.println("The number is not Twisted Even");
		}
	}
}
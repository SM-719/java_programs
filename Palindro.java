import java.util.Scanner;
class Palindro
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int num2 = num;
		int rev = 0;
		while (num2!=0)
		{
			int a = num2%10;
			rev = rev * 10 + a;
			num2/=10;
		}
		

			if (num==rev)
			{
				if(rev %2 == 0)
				{
					System.out.println("The number is Even Palindrome");
				}
				else
				{
					System.out.println("The number is Palindrome but not even");
	
				}
			}
			else
			{	
				if (num%2 == 0)
				{
					System.out.println("The number is Even but not Palindrome");
				}
				else
				{
					System.out.println("The number is neither Even nor Palindrome");
				}
			}
	}
}
import java.util.Scanner;
class CheckFibo
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number");
		int num = sc.nextInt();

		int n1 = 0, int n2 = 1, int n3 ;

		for (; ; )	//to make for loop infinite -> no initialization, no condition, no update // for while & do while state the condition as -> TRUE to make loop infinite
		{
			if (n1 == num)
			{
				System.out.println("The number exists in FIbonacci Series");
				break;
			}
			else if (n1 > num)
			{
				System.out.println("The number is not a Fibonacci number");
			}
			else 
			{
				n3 = n3 + n2;
				n1 n2;
				n2 = n3;
			}
		}
	}
}
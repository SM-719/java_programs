import java.util.Scanner;
class SumDigits
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Sum of Digits of number");
		System.out.println("Enter the number to get the sum of digits");

		int num = sc.nextInt();

		int revrse = 0;
		int count = 0;

		for (int temp = num; temp>0 ; temp++)
		{
			int last = temp % 10;
			reverse = reverse * 10 + last;
			count++;
			System.out.println(last);
		}	

	}
}
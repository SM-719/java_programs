import java.util.Scanner;
class binaryToDecimal
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");

		int num = sc.nextInt();

		System.out.println(binarytodecimal(num));

	}
	public static int binarytodecimal(int num)
	{
		for (int i = num; i > 0; i /=1)
		{
			int rem = num % 2;
			int no = no * 10 + rem;
		}
		return rem;
	}
}
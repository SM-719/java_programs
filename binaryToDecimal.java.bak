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
	public static String binarytodecimal(int num)//27
	{
		
		String bin = "";
		for (int i = num; i > 0; i/=2)
		{
			int rem = i % 2; //27%2=1  13 6 3
			bin = rem + bin;//11011
		}
		return bin;
	}
}
import java.util.Scanner;
class Disarium
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		


	}

	public static int count(int num)
	{
		int count = 0;

		for(int i = 0 ; i >0 ; i/=10)
		{
			count++;
		}
		return count;
	}
}
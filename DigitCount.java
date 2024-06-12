import java.util.Scanner;
class ExtractDigit
{
	public  static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for extracting digits");
		int num = sc.nextInt();
		 

		while(num!=0)
		{
			int digit = num % 10;
			System.out.println("The extracted digits are "+digit);
			num/=10;
		}
	}
}
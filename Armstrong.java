import java.util.Scanner;
class Armstrong
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();


		if (num == Armstrong(num))
		{
			System.out.println("The number "+num+" is an Armstrong number.");
		}
		else
		{
			System.out.println("The number "+num+" is not an Armstrong number.");
		}
	}

	public static int Armstrong(int num)
	{
		int i = num;
		int last = 0; 
		int sum = 0;
		while (i != 0)
		{
			last = i % 10; 
			  
			sum = sum + power(last, num); 
			i = i/10;	
		}
		return sum;
	}
	

	public static int count(int num)
	{
		int count = 0;

		for (int i = num; i > 0; i/=10 )
		{
			count++;
		}
		return count; 
	}

	public static int power(int base, int num)
	{
		int p = count(num);
		int pow = 1;

		for (int i = 0;i < p ; i++)
		{
			pow = pow * base;
		}
		return pow;
	}

}
import java.util.Scanner;
class prime
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num =  sc.nextInt();
		
		
		for (int i = 0 ; i < num/2 ;i++ )
		{
			if(num%i==0)
			{
				System.out.println("not  prime")
			}
			else
			{
				System.out.println("Prime")
			}
		}

	}
}
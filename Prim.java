import java.util.Scanner;
class Pronic 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();

		int i = 1;

		while (i<num)
		{
			int prod = 1;

			if (prod == num)
			{
				System.out.println("It is Pronic Number");
				break;
			}
			else if(prod>num)
			{
				System.out.println("The number is not a Pronic number");
				break;
			}
			else 
			{
				prod = i*(i+1);
			}
			i++;
		}
	}
}
import java.util.Scanner;
class Pronic
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check wheather it is pronic or not");
		int num = sc.nextInt();
			
		isPronic(num);
	}	
	public static void isPronic(int num)
	{
		int i = 0; 
		int mul = 0;
		while (i < num)
		{
			mul = (i+1) * i;
			
			if (num == mul)
			{	
				System.out.println("The number is Pronic number");
				break;
			}
		i++;
		}
			if (num != mul)
			{
				System.out.println("The number is Pronic not number");
			}
	}
}
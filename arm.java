import java.util.Scanner;
class arm 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in)
		System.out.println("Enter the number");
		int num = sc.nextInt();

	}
	public static int count(int num)
	{
		int newno = num;
		int ct = 0;
		while (newno != 0)
		{
			ct++;
			newno/=10;
		}
		return ct;
	}	
	public static int power(int ct)
	{
		
	}
}

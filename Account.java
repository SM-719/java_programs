import java.util.Scanner;
class Account
{
	static double balance;
	static int Pin = 1234;
	static long acno = 987654321; 

	public static void main(String[]args)
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Account Number");
		long acno = sc.nextLong();

		System.out.println("Enter the Pin Number");
		int Pin = sc.nextInt();

		System.out.println("Enter the Amount");
		long amt = sc.nextLong();

		System.out.println("1.Deposit 2.Withdraw");
		int choice = sc.nextInt();

		switch (choice)
		{
			case 1:
			{
				deposit(acno,Pin,amt);
				break;
			}
			case 2:
			{
				withdraw(acno,Pin,amt);
				break;
			}
		}
	}

	public static void withdraw(long acno, int Pin, long amt)
	{
		if (Account.acno == acno && Account.Pin == Pin && amt >=0)
		{
			if (amt < balance )
			{
				balance -= amt ;
				System.out.println("Money Deducted!");
				System.out.println("Available Balance :"+balance);
			}
			else
			{
				System.out.println("Unsuffient Balance");
			}
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
	}
	
	public static void deposit(long acno, int Pin, long amt)
	{
		if (Account.acno == acno && Account.Pin == Pin && amt >=0)
		{
				balance += amt ;
				System.out.println("Money Credited!");
				System.out.println("Available Balance :"+balance);
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
	
	}

}
import java.util.Scanner;
class StaticBlock2
{
	static Scanner sc;

	static
	{
		sc = new Scanner(System.in);
		System.out.println("Global Scanner ref available");
	}
	public static void main(String[]args)
	{
		System.out.println("Enter the first number");
		int n1 = sc.nextInt();

		System.out.println("Enter the second number");
		int n2 = sc.nextInt();

		System.out.println(n1+n2);
		merge();
	}
	public static void merge()
	{
		System.out.println("Enter the first name");
		String fname = sc.next();

		System.out.println("Enter the last name");
		String lname =sc.next();

		System.out.println(fname+" "+lname);
	}
}
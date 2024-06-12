import java.util.Scanner;
class conversion
{
	public static void main(String[]args)
	{
		scanner sc = new Scanner(System.in);
		System.out.println("Enter the Kilometer to convet it into Meter");
		int km = sc.nextInt();
	
		kmToM(km);
	}
	public static int kmToM(int km)
	{
		int m = km*1000;
		System.out.println(m);
		return m;
	}
}
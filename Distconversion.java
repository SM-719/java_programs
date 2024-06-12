import java.util.Scanner;
class Distconversion
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Kilometer to convet it into Meter");
		int km = sc.nextInt();
		System.out.println(kmToM(km));
	
	}
	public static int kmToM(int km)
	{
		int m = km*1000;
		return m;

		mToCm(m);
	
	}
	public static int mToCm(int m);
	{
		int cm = m*100;
		System.out.println(cm);
	}

}
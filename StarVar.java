class StarVar1
{
	static double pi=pi()
		
	public static void main(String[] args) 
	{
		System.out.println("From main");
		System.out.println(pi);
		pi = 4;
		System.out.println(pi);

	}
	public static double pi()
	{
		System.out.println("From pi");
		return 22.0/7.0;
	}
}

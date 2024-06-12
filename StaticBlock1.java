class StaticBlock1
{
	static
	{
		System.out.println("From Static block");
	}

	public static void main(String[] args) 
	{
		System.out.println("From main");
	}
	static
	{
		System.out.println("From static block 2");
	}
}

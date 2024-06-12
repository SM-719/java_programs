class Tej 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 20 ;i++ )
		{
			for (int j = 1 ;j <= 20 ;j++ )
			{
				if (i == 1 && j == 17 || i == 2 && j == 16 || i == 3 && j == 16 || i == 4 && j == 16 || i == 4 && j == 18 || i == 5 && j == 17 || i == 7 && j >= 10 && j <= 20 )
				{
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print(" " +" ");
				}
			}
			System.out.println();
		}
	}
}

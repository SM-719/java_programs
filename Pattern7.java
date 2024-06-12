//a
//bb
//ccc
//import java.util.Scanner;
class Pattern7
{
	public static void main(String[] args) 
	{	

		for (char ch = 'a';	ch <= 'e' ;ch++ )
		{
			for (char ab = 'a'; ab <= ch ; ab++ )
			{
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}
}

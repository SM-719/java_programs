/*a
  a b
  a b c
  a b c d
  a b c d e*/
class Pattern8 
{
	public static void main(String[] args) 
	{
		for (char ch = 'a'; ch < 'f' ;ch++ )
		{
			for (char ab = 'a'; ab<=ch ;ab++ )
			{
				System.out.print(ab+" ");
			}
			System.out.println();
		}
	}
}

import java.util.Scanner;
class calcu
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the operation 1)Addition 2)Substraction 3)Division 4)Multiplication");
		int ch = sc.nextInt();

		switch(ch)
		{
			case 1:
			{
				System.out.println("Addition");
				System.out.println("Enter the fisrt number");
				int num1 = sc.nextInt(); 		

				System.out.println("Enter the second number");
				int num2 = sc.nextInt(); 
				
				int add=num1 + num2;
				System.out.println("The Addition of "+num1+" and "+num2+" is "+add);

				break;
			}

			case 2:
			{
				System.out.println("Substraction");
				System.out.println("Enter the fisrt number");
				int num1 = sc.nextInt(); 		

				System.out.println("Enter the second number");
				int num2 = sc.nextInt(); 		
				
				int sub=num1 - num2;
				System.out.println("The Substraction of "+num1+" and "+num2+" is "+sub);

				break;
			}
			case 3:
			{
				System.out.println("Division");
				System.out.println("Enter the fisrt number");
				int num1 = sc.nextInt(); 		

				System.out.println("Enter the second number");
				int num2 = sc.nextInt(); 	
				
				int div=num1 / num2;
				System.out.println("The Division of "+num1+" and "+num2+" is "+div);

				break;
			}
			case 4:
			{
				System.out.println("Multiplication");
				System.out.println("Enter the fisrt number");
				int num1 = sc.nextInt(); 		

				System.out.println("Enter the second number");
				int num2 = sc.nextInt(); 	
				
				int mul=num1 * num2;
				System.out.println("The Multiplication of "+num1+" and "+num2+" is "+mul);

				break;
			}
		
		}
	}
}
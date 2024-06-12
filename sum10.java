import java.util.Scanner;
class swap
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();

        System.out.println("Enter the second number");
        int b = sc.nextInt();

        int num1 = a;
        int num2 = b;

        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;

        System.out.println("After swapping the value of "+a+" is "+num1+" & "+b+ " is "+num2 );
    }
}
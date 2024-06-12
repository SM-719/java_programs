import java.util.Scanner;
class Star
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of starts");
        int n = sc.nextInt();

        triangle1(n);
        System.out.println();
        triangle2(n);
        System.out.println();
        triangle3(n);
        System.out.println();
        triangle4(n);
        System.out.println();
        number(n);
    }

    public static void triangle1(int n)
    {
          for(int i = 0 ; i <=n ; i++)
        {
            for(int j =0 ; j <i; j++)
            {
                System.out.print("*"+" ");
            }
             System.out.println();
        }
    }

     public static void triangle2(int n)
    {
        for(int i = 0; i <=n ; i++)
        {
            for(int j = 0 ; j <n-i ; j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void triangle3(int n)
    {
          for(int i = 0 ; i <=n ; i++)
        {
            for(int j = 1 ; j <=i; j++)
            {
                System.out.print(" "+" ");
            }
            for(int k = i ; k <n ;k++)
            {
                System.out.print("*"+" ");
            }
             System.out.println();
        }
    }
    public static void triangle4(int n)
    {
         for(int i = 0; i <=n ; i++)
        {
            for(int j = i ; j <n ; j++)
            {
                System.out.print(" "+" ");
            }
            for(int k = n-i ; k < n; k++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void number(int n)
    {
        char ch = 65;
        for(int i = 0; i < n; i++)
        {
            for(char j = 0; j <= i; j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
    
}
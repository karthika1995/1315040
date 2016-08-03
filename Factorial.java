import java.util.Scanner;
class Factorial
{
	public static void main(String[] arg)
	{ int i,fact = 1,n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = in.nextInt();
        if( n == 0 )
        System.out.println("Factorial = 1");
        else
        {
            for(i=1;i<=n;i++)
                fact = fact * i;
            System.out.print(" Factorial = " +fact);
        }
	}
}
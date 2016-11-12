import java.util.Scanner;
class Check
{
	public static void main(String[] arg)
	{
	Scanner in = new Scanner(System.in);
	int n;
	System.out.println("Enter n value:");
	n = in.nextInt();
	if(n>0)
	{
	if((n%2) == 0)
	System.out.println(" The given no. is even");
	else
	System.out.println("The given no. is odd");
	}
	}
}

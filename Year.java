import java.util.Scanner;
class Year
{
	public static void main(String[] arg)
	{
	Scanner in = new Scanner(System.in);
	int n;
	System.out.println("Enter n value:");
	n = in.nextInt();
	if((n%4) == 0)
	System.out.println(" The given year is leap year");
	else
	System.out.println("The given year is not leap year");
	}
}
importjava.util.Scanner;
class multiplication
{
	public static void main(String[] arg)
		{
		int i,n,x;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter any number that table will be displayed");
		n = in.nextInt();
		for(i=1;i<=10;i++)
		{
			x = n * i;
			System.out.println( + n + "x" + i + "=" + x); 
		}
		}
}
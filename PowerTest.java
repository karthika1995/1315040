import java.util.Scanner;
class PowerTest
{
public static void main(String[] arg)
{
	Scanner input = new Scanner(System.in);
	int n,i,x;
	System.out.print(" Enter n and i value ");
	n=input.nextInt();
	i=input.nextInt();
	x=(int)Math.pow(n,i);
	System.out.print(" + n + "  power  "  + i + "  is  " + x");
}
}
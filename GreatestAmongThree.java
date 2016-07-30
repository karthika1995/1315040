import java.util.Scanner;
class GreatestAmongtThree
{
	public static void main(String[] arg)
	{
	Scanner s = new Scanner(System.in);
	int a,b,c;
	System.out.print("Enter a , b and c value:  ");
	a = s.nextInt();
	b = s.nextInt();
	c = s.nextInt();
	if(a>0 && b>0 && c>0)
	{
	if(a>b && a>c)
	System.out.println(" a is greater ");
	else if(b>c && b>a)
	System.out.println(" b is greater ");
	else
	System.out.println("c is greater");
	}
	else
	System.out.println("Enter positive value");
	}
}

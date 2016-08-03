    import java.util.Scanner;
    class hcf
	{
	public static void main(String[] arg)
	{
	Scanner s = new Scanner(System.in);
    int a,b,x,y,hcf,lcm,t;
    System.out.println("Enter the two numbers");
    a = s.nextInt();
    b = s.nextInt();
    x = a;
    y = b;
    while( y != 0 )
        
    {
      t = y;
      y = x % y;
      x = t;
    }
    hcf = x;
    lcm = (x*y)/hcf;
    System.out.println("HCF is " +hcf);
    System.out.println("LCM is " +lcm);
	}
}
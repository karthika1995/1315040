import java.util.Scanner;
 class Swapwithoutvariable
 {
 public static void main(String[] args)
	{
		int	a,b;
        Scanner s = new Scanner(System.in);
		System.out.println("Enter a and b");
        a = s.nextInt();
        b = s.nextInt();
        if(a>=0 && b>=0)
        {
		a = b^a;		
		b = a^b;
		a = a^b;
		System.out.println("After swapping");
		System.out.println("a = " +a+ "b = " +b);
        }
        else
        	System.out.println("Enter proper value");
        
    }
}	

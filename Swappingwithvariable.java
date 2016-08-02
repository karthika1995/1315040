 import java.util.Scanner;
 class Swapwithvariable
 {
 public static void main(String[] args)
	{
		int	a,b,c;
        Scanner s = new Scanner(System.in);
		System.out.println("Enter a and b");
        a = s.nextInt();
        b = s.nextInt();
		c = a;
		a = b; 
		b = c;
		System.out.println("After swapping");
		System.out.println("a = " +a+ "b = " +b+ "c = " +c);
    }
}	
	
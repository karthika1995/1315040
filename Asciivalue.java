import java.util.Scanner;
 class Asciivalue
 {
 public static void main(String[] args)
	{
		int i,n
		System.out.println(" enter n value ");
		Scanner in = new Scanner (System.in);
		n = in.nextInt();
		System.out.println(" ASCII value for small letters ");
		if(n>0)
		{
                for(i='a';i<='z';i++)
		System.out.println( i );
		System.out.println(" ASCII value for capital letters ");
		for(i='A';i<='Z';i++)
		System.out.println( i );
		}
		else
		System.out.println(" enter positive val ");
	}
}
		

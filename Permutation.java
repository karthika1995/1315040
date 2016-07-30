        import java.util.Scanner;
        class Permutation
	{
        public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in);
	int n,r,x,j=1,k=1,i;
	System.out.print(" Enter n and r value ");
	n=input.nextInt();
	r=input.nextInt();
	System.out.println( " n = " + n + "   r = " + r);
	if (n>0 && r>=0 && n>=r)
	{
	for(i=1;i<=n;i++)
	j = j * i;
	System.out.println(" n! =  " + j );
	for(i=(n-r);i>=1;i--)
	k = k * i;
	System.out.println(" (n-r)! =  " + k );
	x = j / k;
	System.out.println(" n!/(n-r)!  is   " + x);
        }
        else
        System.out.println("enter proper values");
        }
        }

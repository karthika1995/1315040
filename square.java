    import java.util.Scanner;
	static sum =0;
	class square
	{
	 public static void main(String[] args) {
        int sum = 0;
        Scanner in = new Scanner(System.in);
        int n,x;
        System.out.print("Enter the number");
        n = in.nextInt();
        if(n>0)
        {
        x = n%10;
        while(x>0)
        {
            calc(n%10,x);
            n = n/10;
        }
        }
        else
        System.out.println("error");
        System.out.println("the output is " +sum);
        private static void calc(int y,int z)
        {
            int i,p = 1,sum =0;
            for( i=1;i<y;i++)
                p = p * i;
                 sum = sum + p;
        }    
	 	
	 }
    
}

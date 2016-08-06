    import java.util.Scanner;
	static sum =0;
	class square
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n,x;
        System.out.print("Enter the number");
        n = in.nextInt();
        x = n%10;
        while(x>0)
        {
            calc(n%10,x);
            n = n/10;
        }
        System.out.println("the output is " +sum);
        private static void calc(int y,int z)
        {
           
            for(int i=1;i<y;i++)
			{
			int p = 1;
            p = p * i;
			}
            sum = sum + p;
        }
    }
    
}

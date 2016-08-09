import java.util.Scanner;
class Fibonacci {
    public static void main(String[] args) {
      
        
    Scanner scan = new Scanner(System.in);
    int n,i,f1 = -1,f2 = 1,f3;
    System.out.print("enter n value");
    n = scan.nextInt();
    if(n>0)
    for(i=1;i<=n;i++)
    {
        f3 = f1 + f2;
        System.out.println(f3);
        f1 = f2; 
        f2 = f3;
    }
    else
        System.out.println("Invalid number");
    }
    
}

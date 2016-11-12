import java.util.Scanner;
public class ReverseANo {

   
    public static void main(String[] args) {
        // TODO code application logic
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to reverse");
        int n = scan.nextInt();
        int r = 0;
        int p = 0;
        if(n > 0)
        {
            p = n%10;
            r = r*10 + p;
            n = n/10;
            System.out.print(n);
        }
        else
            System.out.println("Invalid number");
    }
    
}

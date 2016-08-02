 import java.util.Scanner;
 class Concate
 {
 public static void main(String[] args) {
        String name1,name2;
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the key");
        n = s.nextInt();
        if(n>1)
        {
        System.out.println("Enter two string ");
        name1 = s.nextLine();
        name2 = s.nextLine();
        System.out.println("Concated String " +name1 + name2);
        }
        else
            System.out.println(" The key is >than 1 ");
        
   
        
          }
}		  

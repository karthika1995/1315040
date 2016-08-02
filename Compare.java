 import java.util.Scanner;
 class Compare
 public static void main(String[] args) {
        String name1,name2;
        int x,y;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two string ");
        name1 = s.nextLine();
        name2 = s.nextLine();
        x=name1.length();
        y=name2.length();
        if(name1.startsWith(name2) && name1.length() == name2.length())
            System.out.println("the two strings are equal");
        else
            System.out.println("the two strings are equal");
    }
   
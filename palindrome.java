import java.util.Scanner;
public class palindrome {

    public static void main(String[] args) 
    {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the String:");
        String a=s.nextLine();
        String b="";
        for (int i=a.length()-1;i>=0;i--)
        {
            b=b+a.charAt(i);
        }
        System.out.println("The Entered String:"+a);
        System.out.println("The Reversed String:"+b);
        if(a.equals(b))
        System.out.println("Palindrome");
        else
        System.out.println("Not a palindrome");
    }
}
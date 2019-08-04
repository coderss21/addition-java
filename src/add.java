import java.util.Scanner;

public class add {
    public static void main (String args[])
    {
        int a,b;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the values of a and b: ");
        a=in.nextInt();
        b=in.nextInt();
        int c= a+b;
        System.out.println("Result = " +c);
    }
}

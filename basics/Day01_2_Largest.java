import java.util.*;
import java.lang.*;

class largest
{
    public static void main(String args[])
    {
        int a,b,c;
        System.out.println("Enter three Numbers");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a>b && a>c)
        {
             System.out.println("A is the largest Number");
        }
        else if(b>a && b>c)
        {
             System.out.println("B is the largest Number");
        }
        else if(c>a && c>b)
        {
            System.out.println("C is the largest Number");
        }
    }
}
import java.util.*;
import java.lang.*;

class EvenOdd
{
    public static void main(String args[])
    {
        int a;
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a%2==0)
        {
             System.out.println("The number is Even");
        }
        else
        {
             System.out.println("The number is Odd");
        }

    }
}
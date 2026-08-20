import java.util.*;
import java.lang.*;

class PosNegZero
{
    public static void main(String args[])
    {
        int a;
        System.out.println("Enter The Number");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a==0)
        {
            System.out.println("The given number is zero");
        }
        else if(a>0)
        {
            System.out.println("The given number is positive");
        }
        else if(a<0)
        {
            System.out.println("The given number is negative");
        }
    }
}
// Problem 4: Leap Year Check

// Take a year as input, print whether it's a leap year or not.
import java.util.*;
import java.lang.*;

class LeapYear
{
    public static void main(String args[])
    {
        int a;
        System.out.println("Enter the year"); 
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a % 4 == 0)
        {
            if(a % 100== 0)
            {
                System.out.println("The Year is not a leap year");

            }
            else
            {
                System.out.println("The year is a leap year");
            }
            

        }
        else
        {
            System.out.println("The number is not divible by 4");
        }

    }
    

}
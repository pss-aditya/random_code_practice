////////////////////////////////////////////////////////////////////////////////////////////////////////
// Program : Accept a number from the user and check whether the given number is even or odd.
// Example : Input : 6
//           Output: Entered number is Even
//           Input : 7
//           Output: Entered number is Odd
// Concept : OOP
// Date    : 19/08/2026
// Author  : Aditya Govind Valekar
///////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Display
{
    boolean CheckEvenOdd(int iNo1)
    {
        if(iNo1 % 2 == 0)
        {
            return false;
        }
        else
        {
            return true;
        }

    }
}


public class Program11 {
    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo1 = 0;
        boolean bRet = false;

        System.out.println("Enter the Number :");
        iNo1 = sobj.nextInt();

        Display dobj = new Display();
        bRet = dobj.CheckEvenOdd(iNo1);

        if(bRet == false)
        {
            System.out.println("Entered number is Even");
        }
        else
        {
            System.out.println("Entered number is Odd");
        }
        

        sobj.close();

    }
    
}

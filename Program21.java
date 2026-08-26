/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Program : Accept a number from the user and calculate the difference between the sum of all its factors and non-factors.
//
// Example : Input : 12
//           Output: -22
// Concept : OOP
// Date    : 20/08/2026
// Author  : Aditya Govind Valekar
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Display
{
    public void main(int iNo1)
    {
        int iCnt = 0, iRes1= 0, iRes2 = 0, iDiff= 0;
        if(iNo1 < 0)
        {
            iNo1 = -iNo1;
        }
        
        for(iCnt = 1; iCnt <= iNo1; iCnt++)
        {
            if(iNo1 % iCnt  != 0)
            {
                iRes1 += iCnt;
            }
        }

        for(iCnt = 1; iCnt <= iNo1; iCnt++)
        {
            if(iNo1 % iCnt  == 0)
            {
                iRes2 += iCnt;
            }
        }
        
        iDiff = iRes2 - iRes1;
        System.out.println("Difference between the sum of all its factors and non-factors is :" + iDiff);
    }

}


public class Program21 {

    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;

        System.out.print("Enter the Number              : ");
        iNo = sobj.nextInt();

        Display dobj = new Display();
        dobj.main(iNo);

        sobj.close();
    }
    
}
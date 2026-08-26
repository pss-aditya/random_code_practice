////////////////////////////////////////////////////////////////////////////////////////////////////////
// Program : Accept a number from the user and calculate the sum of all its non-factors.
// Example : Input : 12
//           Output: 50
// Concept : OOP
// Date    : 20/08/2026
// Author  : Aditya Govind Valekar
////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Display
{
    public void main(int iNo1)
    {
        int iCnt = 0,iRes= 0;
        if(iNo1 < 0)
        {
            iNo1 = -iNo1;
        }
        

        for(iCnt = 1; iCnt <= iNo1; iCnt++)
        {
            if(iNo1 % iCnt  != 0)
            {
                iRes += iCnt;
            }
        }
        System.out.println("Sum of Non Factor is :" + iRes);
    }

}


public class Program20 {

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
/////////////////////////////////////////////////////////////////////////////////////////////////////
// Program : Accept a number from the user and calculate the even factorial of the given number.
// Example : Input : 5
//           Output: 8
// Concept : OOP
// Date    : 23/08/2026
// Author : Aditya Govind Valekar
/////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Display
{

    public void main(int iNo1)
    {
        int iCnt = 0;
        int iResult = 1;

        for(iCnt = 2; iCnt <= iNo1; iCnt = iCnt + 2)
            {
                iResult = iResult * iCnt;
            }
        System.out.println("Even Factorial is : " + iResult);
    }
}


public class Program34 {

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

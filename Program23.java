////////////////////////////////////////////////////////////////////////////////////////////////////////
// Program : Accept a number from the user and print all numbers from 1 up to the given number.
// Example : Input : 8
//           Output: 1    2    3    4    5    6    7    8
// Concept : OOP
// Date    : 20/08/2026
// Author  : Aditya Govind Valekar
////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Display
{
    public void main(int iNo1)
    {
        int iCnt = 0;
        if(iNo1 < 0)
        {
            iNo1 = -iNo1;
        }
        for(iCnt = 1; iCnt <= iNo1; iCnt++)
        {
            System.out.print(iCnt + " ");
        }
    }

}


public class Program23 {

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
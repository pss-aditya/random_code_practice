////////////////////////////////////////////////////////////////////////////////////////////////////////
// Program : Accept a number from the user and print the first 5 multiples of that number.
// Example : Input : 4
//           Output: 4    8    12    16    20
// Concept : OOP
// Date    : 21/08/2026
// Author  : Aditya Govind Valekar
////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Display
{
    public void main(int iNo1)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= 5; iCnt++)
        {
            System.out.print((iNo1 * iCnt) + " ");
        }
    }

}


public class Program26 {

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
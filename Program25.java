////////////////////////////////////////////////////////////////////////////////////////////////////////
// Program : Accept a number from the user and print all odd numbers from 1 up to the given number.
// Example : Input : 18
//           Output: 1    3    5    7    9    11    13    15    17
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

        for(iCnt = 1; iCnt <= iNo1; iCnt = iCnt + 2)
        {
            System.out.print(iCnt + " ");
        }
    }

}


public class Program25 {

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
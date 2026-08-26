//////////////////////////////////////////////////////////////////////////////////////////////////////
// Program : Accept a number from the user and display its multiplication table from 1 to 10.
// Example : Input : 2
//           Output: 2    4    6    8    10    12    14    16    18    20
// Concept : OOP
// Date    : 21/08/2026
// Author  : Aditya Govind Valekar
//////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Display
{
    public void main(int iNo1)
    {   
        int iCnt = 0;

        for(iCnt = 1; iCnt <= 10; iCnt++)
        {
            System.out.print((iNo1 * iCnt) + " ");
        }

    }

}


public class Program30 {

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
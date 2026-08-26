/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Program : Accept a number from the user and display its multiplication table in reverse order from 10 to 1.
// Example : Input : 2
//           Output: 20    18    16    14    12    10    8    6    4    2
// Concept : OOP
// Date    : 21/08/2026
// Author  : Aditya Govind Valekar
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Display
{
    public void main(int iNo1)
    {
        int iCnt = 0;

        for(iCnt = 10; iCnt >= 1; iCnt--)
        {
            System.out.print((iNo1 * iCnt) + " ");
        }
    }

}


public class Program31 {

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
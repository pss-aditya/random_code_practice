/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Program : Accept a number from the user and print all numbers from negative of that number to positive of that number.
// Example : Input : 4
//           Output: -4    -3    -2    -1    0    1    2    3    4
// Concept : OOP
// Date    : 20/08/2026
// Author  : Aditya Govind Valekar
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Display
{
    public void main(int iNo1)
    {
        int iCnt = 0;

        for(iCnt = -iNo1; iCnt <= iNo1; iCnt++)
        {
            System.out.print(iCnt + " ");
        }
    }

}


public class Program24 {

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

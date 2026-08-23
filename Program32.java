////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Program : Accept a number from the user and display "*" followed by "#" for the given number of times.
// Example : Input : 5
//           Output: * * * * * # # # # #
// Concept : OOP
// Date    : 23/08/2026
// Author  : Aditya Govind Valekar
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Display
{
    public void main(int iNo1)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo1; iCnt++)
            {
                System.out.print("* ");
            }

        for(iCnt = 1; iCnt <= iNo1; iCnt++)
            {
                System.out.print("# ");
            }
    }

}


public class Program32 {

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

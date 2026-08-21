////////////////////////////////////////////////////////////////////////////////////
// Program : Accept a number from the user and calculate its factorial.
// Example : Input : 5
//           Output: Factorial of number is 120
// Concept : OOP
// Date    : 21/08/2026
// Author  : Aditya Govind Valekar
////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Display
{
    public void main(int iNo1)
    {   
        int iCnt = 0;
        int iFact = 1;

        for(iCnt = 1; iCnt <= iNo1; iCnt++)
        {
            iFact = iFact * iCnt;
        }
        System.out.println("Factorial of number is " + iFact);
    }

}


public class Program29 {

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
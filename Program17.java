////////////////////////////////////////////////////////////////////////////////////////////////////////
// Program : Accept a number from the user and calculate the multiplication of all its factors.
// Example : Input : 12
//           Output: 144
// Concept : OOP
// Date    : 20/08/2026
// Author  : Aditya Govind Valekar
////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Display
{
    public void main(int iNo1)
    {
        int iCnt = 0, iResult = 0;
        if(iNo1 < 0)
        {
            iNo1 = -iNo1;
        }
        
        System.out.print("Factors of Number are         : ");
        System.out.print("[ ") ;

        for(iCnt = 1; iCnt <= iNo1 ; iCnt++)
        {
            if(iNo1 % iCnt  == 0)
            {
                iResult = iCnt * iCnt;
                System.out.print(iCnt + ", "  );
            }
        }
        System.out.println("] ") ;
        System.out.println("Multiplication of Factors are : " + iResult);
    }

}


public class Program17 {

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

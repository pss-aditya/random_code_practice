////////////////////////////////////////////////////////////////////////////////////////////////////////
// Program : Accept a number from the user and display all its factors in decreasing order.
// Example : Input : 12
//           Output: 6    4    3    2    1
// Concept : Procedural Programming
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
        
        System.out.print("Factors of Number are         : ");
        System.out.print("[ ") ;

        for(iCnt = iNo1; iCnt >= 1; iCnt--)
        {
            if(iNo1 % iCnt  == 0)
            {
                System.out.print(iCnt + ", "  );
            }
        }
        System.out.println("] ") ;
    }

}


public class Program18 {

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
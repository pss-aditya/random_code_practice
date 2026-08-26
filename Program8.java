////////////////////////////////////////////////////////////////////////////
// Program : Display Number of * on Screen and Convert Negative to Positive
// Concept : OOP
// Date    : 18/08/2026
// Author  : Aditya Govind Valekar
////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Display
{
    void Star(int iNo1)
    {
        int iCnt = 0;
        System.out.println("-------------------------------------------");
        if(iNo1 < 0)
        {
            iNo1 = -iNo1;
        }

        for(iCnt = 0 ; iCnt < iNo1; iCnt++)
        {
            System.out.println("*");
        }

    }
}



public class Program8 {

    public static void main(String Args[])
    {
        Scanner sobj  = new Scanner(System.in);
        int iNo = 0;
        System.out.println("Enter the number:");
        iNo = sobj.nextInt();

        Display dobj = new Display();
        dobj.Star(iNo);
        sobj.close();
    }
    
}

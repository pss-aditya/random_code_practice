///////////////////////////////////////////////////////////////////
// Program : Display Print 5 to 1 number.
// Concept : OOP
// Date    : 18/08/2026
// Author  : Aditya Govind Valekar
////////////////////////////////////////////////////////////////////

import java.util.*;

class Display
{
    void Reverse(int iNo1)
    {
        int iCnt = iNo1;
        System.out.println("-----------------------------");
        while(iCnt >=1 )
        {
            System.out.println(iCnt);
            iCnt --;
        }

    }
    
}

public class Program6 {

    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;

        System.out.println("Provide the Number:");
        iNo = sobj.nextInt();

        Display dobj = new Display();
        dobj.Reverse(iNo);
        sobj.close();

    }
    
}

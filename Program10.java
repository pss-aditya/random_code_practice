////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Program : Accept two numbers and display the first number for the number of times specified by the second number.
// Example : Input   : 5 3
//           Output  : 5 5 5
// Concept : Function and Loop
// Date    : 19/08/2026
// Author  : Aditya Govind Valekar
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Display
{
    void Freq(int iNo1, int iNo2)
    {
        int iCnt = 0;
        System.out.println("--------------------------------------------------");
        if(iNo1 < 0)
        {
            iNo1 = -iNo1;
        }

        if(iNo2 < 0)
        {
            iNo2 = -iNo2;
        }

        for(iCnt = 0 ; iCnt < iNo2;iCnt++)
        {
            System.out.println(iNo1);
        }

    }
}

public class Program10 {
    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo1 = 0 ,iNo2 = 0;

        System.out.println("Enter the Number you want to Print N times:");
        iNo1 = sobj.nextInt();

        System.out.println("Enter the Frequency of the Number :");
        iNo2 = sobj.nextInt();

        Display dobj = new Display();
        dobj.Freq(iNo1, iNo2);

        sobj.close();

    }
}

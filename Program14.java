////////////////////////////////////////////////////////////////////////////////////////////////////////
// Program : Accept a number from the user and print all even factors of the given number.
// Example : Input  : 12
//           Output : 2    4    6    12
// Concept : OOP
// Date    : 19/08/2026
// Author  : Aditya Govind Valekar
////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Display
{
    public void EvenFactors(int iNo1)
    {
        int iCnt = 0;
        if(iNo1 <= 0)
        {
            System.out.println("Enter a Number Greater than Zero");
        }

        for(iCnt = 1; iCnt <= iNo1; iCnt++)
        {
            if(iNo1 % iCnt == 0)
            {
                if(iCnt % 2 == 0)
                {
                    System.out.println("Even Factors of the Number are :" + iCnt);                
                }
            }
        }
    }

}


public class Program14 {
    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo1 = 0;

        System.out.println("Enter the Number :");
        iNo1 = sobj.nextInt();

        Display dobj = new Display();
        dobj.EvenFactors(iNo1);

        sobj.close();
    }
}

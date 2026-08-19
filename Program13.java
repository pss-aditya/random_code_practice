////////////////////////////////////////////////////////////////////////////////////////////////////////
// Program : Accept a number from the user and print all factors of the given number.
// Example : Input  : 12
//           Output : 1    2    3    4    6    12
// Concept : OOP
// Date    : 19/08/2026
// Author  : Aditya Govind Valekar
////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Display
{
    public void Factorial(int iNo1)
    {
        int iCnt = 0;
        if(iNo1 <= 0)
        {
            System.out.println("Please Enter a Number Greater than Zero");
        }

        for(iCnt = 1; iCnt <= iNo1; iCnt ++)
        {
            if(iNo1 % iCnt == 0)
            {
                System.out.println("Factors of the Given Number are :"+ iCnt);
            }
        }

    }
    
}

public class Program13 {

    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo1 = 0;

        System.out.println("Enter the Number :");
        iNo1 = sobj.nextInt();

        Display dobj = new Display();
        dobj.Factorial(iNo1);

        sobj.close();
    }
    
}

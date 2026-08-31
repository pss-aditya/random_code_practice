////////////////////////////////////////////////////////////////////////////////////
// Program : Accept a number from the user and display its digits in reverse order.
// Example :
// Input : 2395
// Output: 5
//         9
//         3
//         2
//
// Concept : OOP
//
// Date : 31/08/2026
//
// Author : Aditya Govind Valekar
////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Display
{
    public void main(int iNo1)
    {
        int iDigit = 0;

        while(iNo1 != 0)
        {
            iDigit = iNo1 % 10;

            System.out.println(iDigit);

            iNo1 = iNo1 / 10;
        }
    }
}

public class Program41
{
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
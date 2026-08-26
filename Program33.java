//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Program : Accept an amount in US dollars from the user and return its corresponding value in Indian currency, considering 1 US dollar as 70 rupees.
// Example : Input : 10
//           Output: 700
// Concept : OOP
// Date    : 23/08/2026
// Author : Aditya Govind Valekar
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Display
{
    public void main(int iNo1)
    {
        int iResult = 0;

        iResult = iNo1 * 70;

        System.out.println("Amount in Indian Currency is : " + iResult);
    }

}


public class Program33 {

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
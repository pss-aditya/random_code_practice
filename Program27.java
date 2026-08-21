/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Program : Accept a number from the user and display "Small" if it is less than 50, "Medium" if it is between 50 and 99, and "Large" if it is 100 or greater.
// Example : Input : 75
//           Output: Medium
// Concept : OOP
// Date    : 21/08/2026
// Author  : Aditya Govind Valekar
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Display
{
    public void main(int iNo1)
    {
        if(iNo1 < 50)
        {
            System.out.println("Small");
        }
        else if(iNo1 >= 50 && iNo1 <= 99)
        {
            System.out.println("Medium");
        }
        else
        {
            System.out.println("Large");
        }
    }
}

public class Program27 {

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

//////////////////////////////////////////////////////////////////////////////////////////////
// Program : Accept a number from the user and print that many even numbers on the screen.
// Example : Input  : 5
//           Output : 2    4    6    8    10
// Concept : OOP
// Date    : 19/08/2026
// Author  : Aditya Govind Valekar
/////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Display
{
    public void EvenDisplay(int iNo1)
    {
        int iCnt = 0;
        for(iCnt = 0 ; iCnt <iNo1; iCnt ++)
        {
            System.out.println("The Numbers are:" + 2 * (iCnt + 1));
        }

    }

}




public class Program12 {
    
    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo1 = 0;

        System.out.println("Enter the Number :");
        iNo1 = sobj.nextInt();

        Display dobj = new Display();
        dobj.EvenDisplay(iNo1);
        

        sobj.close();
    }
    
}

////////////////////////////////////////////////////////////////////////////////////
// Program : If number is less than 10 then print "Hello" otherwise print "Demo".
// Concept : OOP
// Date    : 18/08/2026
// Author  : Aditya Govind Valekar
////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Display
{
    void Show(int iNo1)
    {
        System.out.println("-------------------------------------------");
        if(iNo1 <= 10)
        {
           System.out.println("Hello"); 
        }
        else
        {
            System.out.println("Demo");
        }
    }
}



public class Program9 {

    public static void main(String Args[])
    {
        Scanner sobj  = new Scanner(System.in);
        int iNo = 0;
        System.out.println("Enter the number:");
        iNo = sobj.nextInt();

        Display dobj = new Display();
        dobj.Show(iNo);
        sobj.close();
    }
    
}

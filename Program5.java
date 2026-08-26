///////////////////////////////////////////////////////////////////
// Program : Display "Do Coding" N times based on user input.
// Concept : OOP
// Date    : 10/08/2026
////////////////////////////////////////////////////////////////////

import java.util.*;

class Display{

    public int doDisplay(int inum1)
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < inum1; iCnt ++)
        {
            System.out.println("Do Coding");
        }
        return iCnt;

    }
}
public class Program5 {

    public static void main(String Args[])
    {
        int iNo1 = 0, iRes = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number:");
        iNo1 = sobj.nextInt();

        Display dobj = new Display();
        iRes = dobj.doDisplay(iNo1);
        System.out.println("It has been Returned " + iRes + " times.");
        sobj.close();



    }
    
}

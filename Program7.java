///////////////////////////////////////////////////////////////////
// Program : Check whether Number is divisible by 5 or not.
// Concept : OOP
// Date    : 18/08/2026
// Author  : Aditya Govind Valekar
////////////////////////////////////////////////////////////////////

import java.util.*;

class Check
{
    boolean Divisible(int iNo1)
    {
        return (iNo1 % 5 == 0);
    }

}
public class Program7 {
    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo1  = 0;
        boolean bRet = false;

        System.out.println("Enter the Number :");
        iNo1 = sobj.nextInt();

        Check cobj = new Check();
        bRet = cobj.Divisible(iNo1);

        if(bRet == true)
        {
            System.out.println("The Number is Divisible by 5");
        }
        else
        {
            System.out.println("The Number is not Divisible by 5");
        }
        sobj.close();


    }
}

/////////////////////////////////////////
// Program : Divide two Numbers
// Concept : OOP
// Date    : 10/08/2026
///////////////////////////////////////////

import java.util.*;

class Divide
{
    public float division(float no1, float no2)
    {
        float fResult = 0.0f;
        if(no2 == 0)
        {
            return -1.0f;
        }
        fResult = no1 / no2;

        return fResult;

    }
}



public class Program4 {

    public static void main(String Args[])
    {
        float fNo1 = 0 , fNo2 = 0, fRes = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value 1 :");
        fNo1 = sobj.nextFloat();
        
        System.out.println("Enter the value 2 :");
        fNo2 = sobj.nextFloat();

        Divide dobj = new Divide();
        fRes = dobj.division(fNo1, fNo2);

        if(fRes == -1.0f)
        {
            System.out.println("Divsion by Zero is not allowed");
        }
        else
        {
            System.out.println("Divsion is :" + fRes);
        }

        sobj.close();
    }
    
}

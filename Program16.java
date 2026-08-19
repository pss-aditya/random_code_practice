////////////////////////////////////////////////////////////////////////////////////////////////////////
// Program : Accept a character from the user and check whether it is a vowel or not.
// Example : Input : a
//           Output: Character is Vowel
//           Input : b
//           Output: Character is not Vowel
// Concept : OOP
// Date    : 19/08/2026
// Author  : Aditya Govind Valekar
////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Display
{
    boolean vowelornot(char cchar)
    {
        cchar = Character.toLowerCase(cchar);
        if(cchar == 'a' || cchar == 'e' || cchar == 'i' || cchar == 'o' || cchar == 'u')
        {
            return true;
        }
        return false;

    }
}

public class Program16 {
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        char cchar = '\0';
        boolean bRet = false;

        System.out.println("Enter a Character");
        cchar = sobj.next().charAt(0);

        Display dobj = new Display();
        bRet = dobj.vowelornot(cchar);
        if(bRet == true)
        {
            System.out.println("Character is Vowel");
        }
        else
        {
            System.out.println("Character is NOT a vowel");
        }
        sobj.close();
    }
    
}

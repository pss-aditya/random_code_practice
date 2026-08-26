////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Program : Accept a character from the user and convert its case from lowercase to uppercase or uppercase to lowercase.
// Example : Input : a
//           Output: A
//           Input : B
//           Output: b
// Concept : OOP
// Date    : 19/08/2026
// Author  : Aditya Govind Valekar
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Display
{
    public void ConvertCharacter(char cchar)
    {
        if(cchar >= 'a' && cchar <= 'z')
        {
            cchar = (char)(cchar - 32);
            System.out.println(cchar);
        }
        else if(cchar >= 'A' && cchar <= 'Z')
        {
            cchar = (char)(cchar + 32);
            System.out.println(cchar);
        }

       ///////////////////////////////////////
       // Internally it behaves like above  
       // Character.toUpperCase(cchar);
       // Character.toLowerCase(cchar);
       ///////////////////////////////////////

    }
}




public class Program15 {

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        char cchar = '\0';

        System.out.println("Enter a Character");
        cchar = sobj.next().charAt(0);

        Display dobj = new Display();
        dobj.ConvertCharacter(cchar);
        sobj.close();
    }
    
}

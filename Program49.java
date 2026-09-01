//////////////////////////////////////////////////////////////////////////////////////////
// Program : Display a square pattern in which each row contains alphabets from 'a' to 'e' in increasing order.
//
// Output : a b c d e
//          a b c d e
//          a b c d e
//          a b c d e
//          a b c d e
//
// Date    : 01/09/2026
//
// Author  : Aditya Govind Valekar
////////////////////////////////////////////////////////////////////////////////////
public class Program49 {

    public static void main(String Args[])
    {
        int irow , icol = 0;
        char alphabhet = 'a';
        for(irow = 1; irow<=5; irow++)
        {
            for(icol = 1; icol<=5; icol++)
            {
                System.out.print((char)(alphabhet + (icol-1))+ " ");
            }
            System.out.println();
        }
    }
    
}

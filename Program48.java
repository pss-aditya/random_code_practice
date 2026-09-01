///////////////////////////////////////////////////////////////////////////////////////////
// Program : Display a square pattern in which each row contains the same alphabet character, increasing from 'a' to 'e'.
//
// Output : a a a a a
//          b b b b b
//          c c c c c
//          d d d d d
//          e e e e e
//
// Date    : 01/09/2026
//
// Author  : Aditya Govind Valekar
////////////////////////////////////////////////////////////////////////////////////
public class Program48 {

    public static void main(String args[])
    {
        int irow , icol =0;
        char alphabet ='a' ;
        for(irow = 1;irow<=5;irow++)
        {
            for(icol=1;icol<=5;icol++)
            {
                System.out.print((char)(alphabet+(irow-1))+" ");
            }
            System.out.println();
        }
    }
    
}

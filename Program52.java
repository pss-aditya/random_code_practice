///////////////////////////////////////////////////////////////////////////////////////////
// Program : Display a square pattern in which each row contains the cubes of numbers from 1 to 6.
//
// Output : 1 8 27 64 125 216
//          1 8 27 64 125 216
//          1 8 27 64 125 216
//          1 8 27 64 125 216
//          1 8 27 64 125 216
//
// Date    : 02/09/2026
//
// Author  : Aditya Govind Valekar
////////////////////////////////////////////////////////////////////////////////////
public class Program52 {

    public static void main(String Args[])
    {
        int irow , icol = 0;  
        
        for(irow = 1; irow<=5; irow++)
        {
            for(icol = 1; icol<=6; icol++)
            {
                int cube = (int)Math.pow(icol,4);
                System.out.print(cube+" ");
            }
            System.out.println();
        }
    }
    
}

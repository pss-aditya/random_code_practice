///////////////////////////////////////////////////////////////////////////////////////////
// Program : Display a square pattern of 10 having the given number of rows and columns.
//
// Output : 10 10 10 10 10
//          10 10 10 10 10
//          10 10 10 10 10
//          10 10 10 10 10
//          10 10 10 10 10
//
// Date    : 01/09/2026
//
// Author  : Aditya Govind Valekar
////////////////////////////////////////////////////////////////////////////////////


public class Program43
{
    public static void main(String Args[])
    {
    int iRow , iCol = 0;

    for(iRow = 1;iRow<=5;iRow++)
    {
        for(iCol = 1;iCol<=5;iCol++)
        {
            System.out.print("10 ");
        }
        System.out.println();
    }
}
}
////////////////////////////////////////////////////////////////////////////////////
// Program         : Reverse Array
//
// Description     : Given an array of integers, reverse the array so that the elements are arranged in the opposite order.
//
// Example 1 -
//          Input  : arr[] = [1, 2, 3, 4, 5]
//          Output : [5, 4, 3, 2, 1]
//
// Constraints     : 1 <= arr.size <= 10^5
//                   0 <= arr[i] <= 10^5
//
// Concept         : Arrays
//
// Date            : 04/09/2026
//
// Author          : Aditya Govind Valekar
////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class Program54
{
    public int[] reverse(int arr[], int x)
    {
        int i = 0, j = arr.length -1 ;
        while(i<j)
        {
            int temp = arr[i]; // temp = 1
            arr[i]   = arr[j]; // arr[0] = arr[4] --> 5 now arr[0] is 5
            arr[j]   = temp;   // arr[4] = 1 
            
            // 1 2 3 4 5 is now 5 2 3 4 1

            i++;
            j--;
        }

        return arr;
        

        
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0;

        System.out.print("Enter the size of Array : ");
        iSize = sobj.nextInt();

        int arr[] = new int[iSize];

        System.out.println("Enter the Array Elements :");

        for(int i = 0; i < iSize; i++)
        {
            arr[i] = sobj.nextInt();
        }

        Program54 pobj = new Program54();

        arr = pobj.reverse(arr,0);

        System.out.println("Elements After Reverse : " + Arrays.toString(arr));

        sobj.close();
    }
}

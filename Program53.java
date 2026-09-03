////////////////////////////////////////////////////////////////////////////////////
// Program : Given an array of integers and an element x, find the index of the first occurrence of x in the array. Return -1 if x is not present in the array.
//
// Example 1 :
// Input : arr[] = [1, 2, 3, 4], x = 3
// Output: 2
//
// Example 2 :
// Input : arr[] = [10, 8, 30, 4, 5], x = 5
// Output: 4
//
// Example 3 :
// Input : arr[] = [10, 8, 30], x = 6
// Output: -1
//
// Constraints :
// 1 <= arr.size <= 10^6
// 0 <= arr[i] <= 10^6
// 0 <= x <= 10^5
//
// Concept : Arrays
//
// Date : 03/09/2026
//
// Author : Aditya Govind Valekar
////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class Program53
{
    public int search(int arr[], int x)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == x)
            {
                return i;
            }
        }

        return -1;
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0;
        int iRet = 0;
        int x = 0;

        System.out.print("Enter the size of Array : ");
        iSize = sobj.nextInt();

        int arr[] = new int[iSize];

        System.out.println("Enter the Array Elements :");

        for(int i = 0; i < iSize; i++)
        {
            arr[i] = sobj.nextInt();
        }

        System.out.print("Enter the element you want to search : ");
        x = sobj.nextInt();

        Program53 pobj = new Program53();

        iRet = pobj.search(arr, x);

        System.out.println("Index of element is : " + iRet);

        sobj.close();
    }
}

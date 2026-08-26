////////////////////////////////////////////////////////////////////////////////////
// LEETCODE 136 - SINGLE NUMBER
//Program : Given a non-empty array of integers in which every element appears exactly twice except for one element, find and return the element that appears only once.
//
// Example 1  :-
// Input      : nums = [2, 2, 1]
// Output     : 1
//
// Example 2 :
// Input     : nums = [4, 1, 2, 1, 2]
// Output    : 4
//
// Example 3 :
// Input     : nums = [1]
// Output    : 1
//
// Constraints :
// 1 <= nums.length <= 3 * 10^4
// -3 * 10^4 <= nums[i] <= 3 * 10^4
// Each element in the array appears twice except for one element which appears only once.
// Concept : OOP
// Date : 26/08/2026
// Author : Aditya Govind Valekar
////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Display
{

    public int main(int[] iNo1)
    {
        int i = 0, j= 0;
        
        for(i = 0 ; i < iNo1.length; i++)
        {
            int iFreq = 0;

            for(j = 0; j < iNo1.length; j++)
            {
                if(iNo1[i] == iNo1[j])
                {
                    iFreq++;
                }
            }

            if(iFreq == 1)
            {
                System.out.println(iNo1[i]);
                return iNo1[i];
            }
        }
        return -1;
    }
}


public class Program35 {

    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter size of Array : ");
        int iSize = sobj.nextInt();

        int[] iNo = new int[iSize];

        System.out.println("Enter Array Elements :");

        for(int i = 0; i < iSize; i++)
        {
            iNo[i] = sobj.nextInt();
        }

        Display dobj = new Display();
        dobj.main(iNo);

        sobj.close();
    }
    
}

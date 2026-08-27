////////////////////////////////////////////////////////////////////////////////////
// Program : Given an array of integers, find and return the second-largest distinct element. If a second-largest distinct element does not exist, return -1.
//
// Example 1 :
// Input : nums = [8, 8, 7, 6, 5]
// Output: 7
//
// Example 2 :
// Input : nums = [10, 10, 10, 10, 10]
// Output: -1
//
// Example 3 :
// Input : nums = [7, 7, 2, 2, 10, 10, 10]
// Output: 7
//
// Constraints :
// 1 <= nums.length <= 10^5
// -10^4 <= nums[i] <= 10^4
// nums may contain duplicate elements.
//
// Concept : Arrays
//
// Date : 27/08/2026
//
// Author : Aditya Govind Valekar
////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class Display{
    public int SecondLargest(int [] nums)
    {
        int Largest = Integer.MIN_VALUE;
        int SecondLargest  = Integer.MIN_VALUE;

        for(int num : nums)
        {
            if(num > Largest)
            {
                SecondLargest = Largest;
                Largest = num;
                System.out.println("Now the value inside First Largest is  : " + Largest);
                System.out.println("Now the value inside Second Largest is : " + SecondLargest);
            }

            else if(num < Largest && num > SecondLargest){
                SecondLargest = num;
            }
        }

        if (SecondLargest == Integer.MIN_VALUE) {
            return -1;
        }

        return SecondLargest;

    }
}

public class Program38 {

    public static void main(String Args[])
    {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Size of Array");
        int size = sobj.nextInt();

        System.out.println("Enter the Elements inside Array : " );
        int [] nums = new int[size];

        for (int i = 0; i < size; i++)
        {
            nums[i] = sobj.nextInt();
        }

        Display dobj = new Display();
        iRet = dobj.SecondLargest(nums);
        System.out.println("--------------------------------------------");
        System.out.println( "Finally the Second Largest is : " + iRet);

        sobj.close();


    }
    
}

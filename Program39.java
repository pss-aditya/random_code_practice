import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////////////
//
// Program : Accept the radius of a circle from the user and calculate its area
//           by considering the value of PI as 3.14.
//
// Example 1 :
// Input : 5.3
// Output: 88.2026
//
// Example 2 :
// Input : 10.4
// Output: 339.6224
//
// Concept : OOP
//
// Date : 28/08/2026
// Author : Aditya Govind Valekar
//
////////////////////////////////////////////////////////////////////////////////////

public class Program39
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        double radius = 0.0;
        double area = 0.0;
        final double PI = 3.14;

        System.out.println("Enter the radius of circle :");
        radius = sobj.nextDouble();

        area = PI * radius * radius;

        System.out.println("Area of circle is : " + area);

        sobj.close();
    }
}
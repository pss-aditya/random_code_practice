import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////////////
//
// Program : Accept the width and height of a rectangle from the user and calculate
//           its area.
//
// Example :
// Input : 5.3 9.78
// Output: 51.834
//
// Concept : Procedural Programming
//
// Date : 28/08/2026
//
// Author : Aditya Govind Valekar
//
////////////////////////////////////////////////////////////////////////////////////

class Program40
{
    public static double CalculateArea(double width, double height)
    {
        return width * height;
    }

    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        double width = 0.0;
        double height = 0.0;
        double area = 0.0;

        System.out.println("Enter width : ");
        width = sobj.nextDouble();

        System.out.println("Enter height : ");
        height = sobj.nextDouble();

        area = CalculateArea(width, height);

        System.out.println("Area of rectangle is : " + area);

        sobj.close();
    }
}
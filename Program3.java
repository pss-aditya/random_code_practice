import java.util.*;

public class Program3 {
    public static void main(String Args[])
    {
        int iNo1 = 0;
        int iNo2 = 0;
        int iResult = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the First Number : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter the Second Variable : ");
        iNo2 = sobj.nextInt();

        iResult = iNo1 + iNo2;
        System.out.println("The Result is :" + iResult);

        sobj.close();

        
    }
}

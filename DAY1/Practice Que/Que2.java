import java.util.*;
// Area of the Square
public class Que2{
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the side: ");
        float Side = sc.nextFloat();

        float Area = Side*Side;
        System.out.print("Area of square is:"+ Area);

    }
}
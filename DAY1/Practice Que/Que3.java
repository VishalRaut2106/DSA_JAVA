import java.util.*;

public class Que3{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Cost of Pencil: ");
        float a = sc.nextFloat();
        System.out.print("Enter the Cost of Pen: ");
        float b = sc.nextFloat();
        System.out.print("Enter the Cost of Eraser: ");
        float c = sc.nextFloat();

        float bill = a+b+c;
        System.out.print("bill is: "+bill);
        
        // Add GST 18%
        float gst = bill+(0.18f*bill);
        System.out.print("Bill with GST is :$"+gst);


    }
}
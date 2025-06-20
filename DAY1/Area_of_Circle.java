import java.util.*;
public class Area_of_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        float Radius = sc.nextFloat();
    
        // double Area_of_Circle = Radius * Radius * Math.PI;
        float Area_of_Circle = Radius * Radius * 3.14159f;
        
        System.out.println("Area of Given Circle is: "+ Area_of_Circle);
    }


}
 
import java.util.*;
public class Practice {
    public static double average (Scanner sc){
    
        System.out.print("Enter the first value: ");
        double  a = sc.nextDouble();
        System.out.print("Enter the second value: ");
        double  b = sc.nextDouble();
        System.out.print("Enter the third value: ");
        double  c = sc.nextDouble();
       
       

       return (a + b + c)/ 3;
        
        
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        double avg = average(sc);
        System.out.println("Average in interger  is: " + (int)avg);
        System.out.println("Average in double is: " + avg);
        System.out.printf("Average (2 decimal places): %.2f\n", avg);


    }
}

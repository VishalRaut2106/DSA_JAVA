import java.util.*;

public class Que{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
           System.out.print("Enter the number of lines: ");
    int k = sc.nextInt();
        for (int line = 1 ; line <= k ; line++){
            for (int star = 1; star <= line ; star++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
} 
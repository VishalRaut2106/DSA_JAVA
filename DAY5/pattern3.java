import java.util.*;

public class Que{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number of lines: ");

        int k = sc.nextInt();


        for ( int line =1 ; line <=k ; line++){
            for (int num = 1 ; num <=line ; num++){
                System.out.print(num +"*");
            }
            System.out.println();
        }

    }
} 

/**
 
1 
1 2
1 2 3
1 2 3 4
1 2 3 4 5

 */
import java.util.*;

public class Que{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        do {

                System.out.print("Enter the number: ");
                int num = sc.nextInt();
            
                if (num % 10 ==0){

                System.out.println("Multiple of 10 Skipped ");
                    continue;
                }
            
                System.out.println("user: "+ num);

            }while(true);
    }
} 
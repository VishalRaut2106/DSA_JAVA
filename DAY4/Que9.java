import java.util.*;

public class Que{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
         System.out.print("Enter the number: ");
        int n = sc.nextInt();

        boolean isPrime = true;
        for(int i=2; i<=Math.sqrt(n); i++){
            if (n % i == 0 ){  // n is a multiple of i (i not equal to 1 or  n)
                isPrime =false;
            }


        }

        if (isPrime == true){
            System.out.println(n+" is Prime");
        }else {
            System.out.println(n+" is not prime");

        }
    }
} 
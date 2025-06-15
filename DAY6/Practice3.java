import java.util.*;
public class Practice3 {

    public static int sumofDigits(int n){
        int sum =0 ;
        while( n > 0){
            int lastDig = n % 10;
            sum +=lastDig;
            n /=10;
        }
        return sum ;     
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int digit = sc.nextInt();
        System.out.println("The sum is " + sumofDigits(digit));
    }
}
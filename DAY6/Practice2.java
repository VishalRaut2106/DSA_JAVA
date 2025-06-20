import java.util.*;
public class Practice2 {

    public static boolean isEven(int n){
        return n % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
         if (isEven(num)) {
            System.out.println(num + " is a Even");
         }else{
            System.out.println(num + " is a odd");
         }
    }
}
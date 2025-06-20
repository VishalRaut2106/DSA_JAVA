import java.util.*;
public class sum_of_A_B {


     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A :");
        int A = sc.nextInt();
        System.out.print("Enter B :");
        int B = sc.nextInt();

        int sum = A + B;
        System.out.println("A :"+A + "\nB :"+B);
        System.out.println("the total of A and B is: "+sum);
     }
}
import java.util.*;

public class Product_of_A_B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A :");
        int A = sc.nextInt();
        System.out.print("Enter B :");
        int B = sc.nextInt();

        int Product = A * B;
        System.out.println("A :"+A + "\nB :"+B);
        System.out.println("the Product of A * B is: "+Product);
    }
}
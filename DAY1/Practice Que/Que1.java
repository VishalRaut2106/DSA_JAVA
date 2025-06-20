import java.util.*;
public class Que1{

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter A : ");
        int A =sc.nextInt();
        System.out.print("Enter B : ");
        int B =sc.nextInt();
        System.out.print("Enter C : ");
        int C =sc.nextInt();

        int avg = (A+B+C)/3;
        System.out.println("avg is: "+avg);
        

    }
}
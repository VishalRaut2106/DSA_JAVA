import java.util.*;

public class Que{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Number: ");
    int num = sc.nextInt();
    while(num > 0){
        int LastDig = num % 10;
        System.out.print(LastDig);
        num = num / 10 ;
    }
    }
} 
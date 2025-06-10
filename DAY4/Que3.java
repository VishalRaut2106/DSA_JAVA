import java.util.*;

public class Que{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);

        int sum = 0;
        int i =1;
        System.out.print("Enter the N: ");
        int n =sc.nextInt();
        
        while(i<=n){
            sum +=i;
            System.out.println((sum - i)+ "+"+i +"="+ sum );
            i++;
        }
    }
} 
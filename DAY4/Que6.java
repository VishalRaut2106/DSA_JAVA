import java.util.*;

public class Que{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
int n =10899;
int rev = 0;

    while(n>0){
        int last = n%10;
        rev = (rev*10)+ last;
        n/=10;
    }

    System.out.println(rev);


    }
} 
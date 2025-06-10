import java.util.*;

public class Que{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Lines You want: ");
int n =sc.nextInt(); 
        System.out.print("Enter the Number of Stars You want: ");
int Stars =sc.nextInt(); 
for(int line=1; line<=n ;line++){
   for(int i = 1;i<=Stars;i++){
     System.out.print("*");
   }
   System.out.println();

}
    }
} 
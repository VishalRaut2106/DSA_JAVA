import java.util.*;
public class practice {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the Year: ");
    int year = sc.nextInt();

    boolean x = (year%4)==0;
    boolean y = (year%100)!=0;
    boolean z = (year%400)==0;


   String ans = (x && (y || z))? year + " is a leap year": year + " is not leap year";
    System.out.println(ans);
   } 
}

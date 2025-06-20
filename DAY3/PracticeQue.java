import java.util.*;
public class practice {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     System.out.print("enter A: ");
    int a = sc.nextInt();
     System.out.print("enter B: ");
    int b = sc.nextInt();


     System.out.print("enter Operator: ");
    char operator = sc.next().charAt(0);
     System.out.print("Your answer :  ");
    switch (operator){
        case '+': System.out.println(a+b);
                break;
        case '-': System.out.println(a-b);
                break;
        case '*': System.out.println(a*b);
                break;
        case '/': System.out.println(a/b);
                break;
        case '%': System.out.println(a%b);
                break;
        default :  System.out.println("Wrong Operator");
        
    }


   } 
}

import java.util.*;
public class if_else {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number1: ");
    int number1 = sc.nextInt();
   
    

    if (number1 %2 ==0){
        System.out.println(number1 +" is Even Number");
    }
    
    else{
         System.out.println(number1+" is Odd Number");
       }
   } 
}


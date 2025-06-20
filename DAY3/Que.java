import java.util.*;
public class if_else {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number1: ");
    int number1 = sc.nextInt();
    System.out.print("Enter number2: ");
    int number2 = sc.nextInt();
    

    if (number1 > number2){
        System.out.println(number1+" is greater than "+ number2);
    }
    else if(number1 == number2){

         System.out.println(number1+" is equal to "+ number2);
    }
    else{
         System.out.println(number1+" is less than "+ number2);
       }
   } 
}


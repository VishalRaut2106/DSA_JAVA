import java.util.*;
public class javabasics{
public static void printHello(){
    System.out.println("hello world");
    System.out.println("hello world");
    System.out.println("hello world");
    System.out.println("hello world");
}

public static void calculate(int a , int b) {   // parameters or formal parameters
    int sum = a + b ; 
    System.out.println("sum is: "+ sum);
}
public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = sc.nextInt();
        System.out.print("Enter B: ");
        int b = sc.nextInt();
        
    printHello(); 
    calculate(a , b); 
    
    }
} 


import java.util.*;
public class Zero_OneTriangle {
    public static void zero_one(int n){
        for (int i = 1 ; i<=n ; i++){
            for (int j =1 ; j<=i; j++){
                if ((i+j)% 2 ==0) {// if number is even their  1 else 0
                    System.out.print(" 1 ");
                }else{
                    System.out.print(" 0 ");
                }

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Number of lines:  ");
        int lines = sc.nextInt();
        zero_one(lines);
    }

/**
     
Enter the Number of lines:  5
 1 
 0  1
 1  0  1
 0  1  0  1
 1  0  1  0  1

 */
}

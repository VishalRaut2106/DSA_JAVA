import java.util.Scanner;

public class butterfly {
    public static void butter(int n){
        
        // 1st half
        for ( int i =1 ; i<=n; i++){
           // Print stars for left wing
            for(int j=1; j<=i; j++ ){
                System.out.print("*");
            }
            // middle spaces
            for (int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            // Print stars for right wing
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        // 2nd Half
        for ( int i=n; i>=1; i--){
            for(int j=1; j<=i; j++ ){
                System.out.print("*");
            }
            // Spaces
            for (int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            // stars -i
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }   
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int n = sc.nextInt();
    butter(n);
}

    
}


/**
 
Enter the number of rows: 4
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *

 */
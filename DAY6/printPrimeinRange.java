import java.util.*;
public class printPrimeinRange {
    
    public static boolean isPrime(int n){
        if (n <= 1) return false ;
        if (n == 2) return true ;

        for (int i = 2; i<=Math.sqrt(n); i++){
            if (n % i ==0)
                return false ; 
        }
        return true;
        
    }
    public static void primeinrange (int n){
        for (int i =2 ;  i<= n; i++ ){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
    int n = sc.nextInt();
        primeinrange(n);
    }
}

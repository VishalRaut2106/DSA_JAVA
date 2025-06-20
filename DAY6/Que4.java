import java.util.Scanner;

public class Que4 {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;   // 0 and 1 are not prime
        if (n == 2) return true;    // 2 is prime

        for (int i = 2; i <= Math.sqrt(n); i++) {  // optimize loop
            if (n % i == 0) {
                return false;  // completely divisible → not prime
            }
        }
        return true;  // prime
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime: ");
        int num = sc.nextInt();

        System.out.println(num + (isPrime(num) ? " is a prime number." : " is not a prime number."));


        sc.close();
    }
    
}


// public class Que4 {
//       public static boolean isPrime(int n ){
//             for(int i = 2 ; i <=n-1 ; i++){
//                 if (n %  i ==0){
//                     // Comppetly divideing
                 
//                     return false ; 
//                 }
//             }
//             return true ; 
//       }

//       public static void main(String[] args) {
//         System.out.println(isPrime(6));
//       }
// }

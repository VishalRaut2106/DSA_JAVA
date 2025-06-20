import java.util.*;
public class Que3 {
        public static int factorial (int n){
        
        int f =1;
        for (int i = 1; i<= n; i++){
                f *=i;
        }
        return f;
    }
    public static int binomialCoefficient(int n , int r){
        int nFact = factorial(n);
        int rFact = factorial(r);
        int nrFact = factorial(n-r);
        int binmialcoeff = nFact/(rFact * nrFact);
       return  binmialcoeff ; 
    }
    
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        System.out.print("Enter R: ");
            int r = sc.nextInt();
        System.out.println("Binomial coefficient is: " + binomialCoefficient(n ,r));
        
    }
}

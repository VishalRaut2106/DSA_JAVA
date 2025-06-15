public class decimalTobinary {
    
public static void dectoBin(int n) {
    int myNum = n;
    int pow  = 0;
    int binNUm = 0 ; 

    while (n > 0){ 
     int rem = n % 2 ;
     binNUm +=(rem * (int)Math.pow(10,pow));
     pow++ ; 
     n = n/2 ; 



}
System.out.println("Binery form of "+ myNum + " = " + binNUm);
}
public static void main(String[] args) {
    dectoBin(7);
}

}

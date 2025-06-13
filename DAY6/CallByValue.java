public class CallByValue {
    
    public static void main(String[] args) {
        // swap = value
        int a = 5;
        int b = 10 ;

       int temp = a;
       a =b;
       b = temp;
       System.out.println("a: " +a); 
       System.out.println("b: " +b); 
    }
}

public class Que {
    public static int  multipy(int a , int b){
        int product = a * b ; 
        return product;
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int prod =    multipy(a, b);
        System.out.println("a * b: "+ prod);
      int prod2 =   multipy(5, 7);
      System.out.println(prod2);
    }
}

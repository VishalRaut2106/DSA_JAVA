public class invertedPyramid {
    public static void invertedpyra(int n){
        for ( int i = 1; i<=n; i++){

            for(int j =1; j<=n-i+1; j++){
                System.out.print(j+ " ");
                 
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        int num = 8;
        invertedpyra(num);
    }
}
/**
1 2 3 4 5 6 7 8 
1 2 3 4 5 6 7 
1 2 3 4 5 6 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2
1 

 */
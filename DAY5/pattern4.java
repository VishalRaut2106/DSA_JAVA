import java.util.*;

public class Que{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();
        char ch ='A';


        for(int line = 1 ; line <= n ; line++){
            for( int alphabet =1 ; alphabet <= line; alphabet++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
} 

/**
A
BC
DEF
GHIJ
KLMNO 
 
 */
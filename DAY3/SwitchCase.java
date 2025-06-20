import java.util.*;
public class SwitchCase{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice 1 to 4");
        int number= sc.nextInt();
        switch(number){
            case 1 : System.out.println("Toyota Fortuner");
            break;
            case 2 : System.out.println("Mercedes-Benz A-Class Limousine");
            break;
            case 3 : System.out.println("Land Rover Defender");
            break;
            
            case 4 : System.out.println("we realize ae are day-dreaming");
        }
    }
}
import java.util.*;
public class basicArray{

    public static void main(String[] args) {
        // int num[] = new int [50];
        // System.out.println(marks);

        // Input

        Scanner sc = new Scanner(System.in);
        int marks []= new int[100];

        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        System.out.println("phy: "+marks[0]);
        System.out.println("chem: "+marks[1]);
        System.out.println("math: "+marks[2]);

        // length
        System.out.println("outof: " + marks.length);

        // update
        int percentage = (marks[0]+ marks[1]+ marks[2]) / 3;
        System.out.println("percenatage = "+percentage+"%");
    }
}
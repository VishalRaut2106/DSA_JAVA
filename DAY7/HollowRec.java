import java.util.*;
public class HollowRec {
    public static void Hollow_Rec(int totRows, int totCols ) {
        // Outer loop - rows
        for (int i = 1; i <= totRows; i++) {
            // Inner loop - columns
            for (int j = 1; j <= totCols; j++) {
                // Check for boundary condition
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // move to next line after each row
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int totRows = sc.nextInt();
        System.out.print("Enter Columns: ");
        int totCols = sc.nextInt();


        Hollow_Rec(totRows , totCols);

    }
}

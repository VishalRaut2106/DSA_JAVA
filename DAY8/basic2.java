public class basic2 {
    public static void update(int marks[]){
        for (int i=0; i<marks.length;i++){
            marks[i] = marks[i] +1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {97,98,99};
        System.out.println("Orginal marks: "+marks[0]+ ","+marks[1]+","+marks[2]);

        update(marks);
        // print marks
        System.out.print("updated marks: ");
     for (int i=0; i<marks.length;i++){
            System.out.print( marks[i]+ ",");
        }
        System.out.println();   
    }
}

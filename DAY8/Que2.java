
public class Que2 {
    
    public static int largestNumber(int numbers[]){

        int largest = Integer.MIN_VALUE; //-infinity
        int smallest = Integer.MAX_VALUE; //+inpfinity

        for (int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest =numbers[i];
            }
            if (smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("smallest element is :"+smallest);
        return largest ; 
    }


    public static void main(String[] args) {
         int numbers[] ={8,2,3,6,4,5};
         System.out.println("largest element is :"+largestNumber(numbers));
    }
}

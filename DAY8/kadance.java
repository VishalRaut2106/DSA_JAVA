public class kadance {
    public static void kadanceAlgo(int numbers[]) {
        int ms = numbers[0]; // Start with first element
        int cs = numbers[0]; // Start with first element

        for (int i = 1; i < numbers.length; i++) {
            cs = Math.max(numbers[i], cs + numbers[i]);
            ms = Math.max(ms, cs);
        }

        System.out.println("Our max subarray sum is: " + ms);
    }

    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4,-1,-2,1,5,-3};
        kadanceAlgo(numbers);
    }
}


// big(O)
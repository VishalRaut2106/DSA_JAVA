public class printSubArray {

    public static void subArray(int numbers[]) {
        int Total = 0;
        int largest2 = Integer.MIN_VALUE; // -infinity
        int smallest2 = Integer.MAX_VALUE; // +infinity

        for (int i = 0; i < numbers.length; i++) {
            int largest = Integer.MIN_VALUE;
            int smallest = Integer.MAX_VALUE;
            int sum = 0, tot = 0;

            for (int j = i; j < numbers.length; j++) {
                sum += numbers[j];

                if (sum > largest) largest = sum;
                if (sum < smallest) smallest = sum;

                if (sum > largest2) largest2 = sum;
                if (sum < smallest2) smallest2 = sum;

                // Print the subarray
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                    tot += numbers[k];
                    Total += numbers[k];
                }

                System.out.println();
                System.out.println("sum is: " + sum);
            }

            System.out.println("smallest sum is: " + smallest);
            System.out.println("largest sum is: " + largest);
            System.out.println("total of the SubArray is: " + tot);
            System.out.println();
        }

        System.out.println("smallest From All: " + smallest2);
        System.out.println("largest From All: " + largest2);
        System.out.println("total of all arrays is: " + Total);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        subArray(numbers);
    }
}


// 2 
// sum is: 2
// 2 4
// sum is: 6
// 2 4 6
// sum is: 12
// 2 4 6 8
// sum is: 20
// 2 4 6 8 10
// sum is: 30
// smallest sum is: 2
// largest sum is: 30
// total of the SubArray is: 70

// 4
// sum is: 4
// 4 6
// sum is: 10
// 4 6 8
// sum is: 18
// 4 6 8 10
// sum is: 28
// smallest sum is: 4
// largest sum is: 28
// total of the SubArray is: 60

// 6
// sum is: 6
// 6 8
// sum is: 14
// 6 8 10
// sum is: 24
// smallest sum is: 6
// largest sum is: 24
// total of the SubArray is: 44

// 8
// sum is: 8
// 8 10
// sum is: 18
// smallest sum is: 8
// largest sum is: 18
// total of the SubArray is: 26

// 10
// sum is: 10
// smallest sum is: 10
// largest sum is: 10
// total of the SubArray is: 10

// smallest From All: 2
// largest From All: 30
// total of all arrays is: 210
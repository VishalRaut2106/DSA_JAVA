public class MaxSumof_SubArray {

    public static void subArray(int array[]) {
        int overallMaxSum = Integer.MIN_VALUE;
        int overallMinSum = Integer.MAX_VALUE;

        for (int start = 0; start < array.length; start++) {
            int currentSum = 0;

            for (int end = start; end < array.length; end++) {
                currentSum += array[end];

                // Print current subarray
                for (int k = start; k <= end; k++) {
                    System.out.print(array[k] + " ");
                }
                System.out.println("=> Sum: " + currentSum);
                
                // Update overall max and min
                overallMaxSum = Math.max(overallMaxSum, currentSum);
                overallMinSum = Math.min(overallMinSum, currentSum);
            }
            System.out.println();
        }

        System.out.println("Maximum subarray sum: " + overallMaxSum);
        System.out.println("Minimum subarray sum: " + overallMinSum);
    }

    public static void main(String[] args) {
        int array[] = {2, 4, 6, 8, 10};
        subArray(array);
    }
}

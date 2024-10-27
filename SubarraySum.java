public class SubarraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        findSubarraySumsAndMax(arr);
    }

    public static void findSubarraySumsAndMax(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int max = arr[i]; // Initialize max with the first element of subarray
            for (int j = i; j < n; j++) {
                sum += arr[j];
                max = Math.max(max, arr[j]); // Update max if a greater element is found
                // Using the formula for sum of consecutive integers
                int subarrayLength = j - i + 1;
                int sumFromFormula = subarrayLength * (subarrayLength + 1) / 2;
                System.out.println("Sum of subarray [" + i + ".." + j + "]: " + sum + " (Calculated using formula: " + sumFromFormula + ")");
                System.out.println("Max of subarray [" + i + ".." + j + "]: " + max);
            }
        }
    }
}

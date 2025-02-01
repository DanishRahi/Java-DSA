import java.util.HashMap;
import java.util.Map;

public class ValueofAllSubArray {

    static final int MOD = 1000000007;

    public static int sumOfSubarrayValues(int[] arr) {
        int n = arr.length;
        long result = 0;

        // Iterate through all possible subarrays
        for (int start = 0; start < n; start++) {
            Map<Integer, Integer> countMap = new HashMap<>();

            for (int end = start; end < n; end++) {
                // Count occurrences of each element in the current subarray
                countMap.put(arr[end], countMap.getOrDefault(arr[end], 0) + 1);

                // Calculate value of the current subarray
                int value = 0;
                for (int count : countMap.values()) {
                    if (count > 1) {
                        value++;
                    }
                }

                // Add the value of the current subarray to the result
                result = (result + value) % MOD;
            }
        }

        return (int) result;
    }

    public static void main(String[] args) {
        // Example
        int[] arr = {1, 2, 1, 2};
        int result = sumOfSubarrayValues(arr);
        System.out.println("Output: " + result);
    }
}



	import java.util.Scanner;
	public class PopulateArray {

	    public static void populateArray(int[] arr, int n) {
	        int left = 0;
	        int right = n - 1;
	        int value = 1;

	        // Populate the array in the specified order
	        while (left <= right) {
	            arr[left++] = value++;
	            if (left <= right) {
	                arr[right--] = value++;
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the number of test cases
	        int t = scanner.nextInt();

	        for (int i = 0; i < t; i++) {
	            // Input for each test case
	            int n = scanner.nextInt();

	            // Create an array of size n
	            int[] arr = new int[n];

	            // Populate the array
	            populateArray(arr, n);

	            // Print the elements of the array separated by a single space
	            for (int value : arr) {
	                System.out.print(value + " ");
	            }
	            
	            System.out.println(); // Move to the next line for the next test case
	        }

	        scanner.close();
	    }
	}

	


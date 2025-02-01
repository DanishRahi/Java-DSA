
public class PrintAllPairs {

	public static void main(String[] args) {
		int arr[] = {1,3,4,6,9};
		PrintAllpairs(arr);

	}

	private static void PrintAllpairs(int[] arr) {
		int n = arr.length;
		for(int i = 0; i<n-1; i++) {
			for(int j= i+1; j < n; j++) {
				System.out.println("(" + arr[i] + "," + arr[j] + ")");

			}
		}
	}

}


public class MergeSort {
 static void mergeSort(int input[], int startIndex, int endIndex) {
	 if(startIndex >= endIndex) {
		 return;
	 }
	 // It is Divide and conqur rule;
	 int mid = (startIndex + endIndex) / 2;
	 // part 1
	  mergeSort(input, startIndex, mid);
	  // part 2
	  mergeSort(input, mid + 1, endIndex);
	  merge(input, startIndex, endIndex);
 }
 
 
 
	private static void merge(int[] input, int startIndex, int endIndex) {

		int mid  = (startIndex + endIndex) / 2;
		int ans[] = new int[endIndex - startIndex + 1];
		int i = startIndex;
		int j = mid + 1;
		int k = 0;
		while(i <= mid && j <= endIndex) {
			if(input[i] < input[j]) {
				ans[k] = input[i];
				i++;
				k++;
			}else {
				ans[k] = input[j];
				k++;
				j++;
			}
		}
		
		while(i <= mid) {
			ans[k]=input[i];
			i++;
			k++;
			
		}
		while(j <= endIndex) {
			ans[k] = input[j];
			k++;
			j++;
		}
	for(int index = 0; index < ans.length; index++) {
		input[startIndex + index] = ans[index];
	}
}



	public static void main(String[] args) {
		 int arr[] = {5,2,8,9,1};
		 mergeSort(arr, 0, arr.length - 1);
		 for(int i = 0; i < arr.length; i++) {
			 System.out.print(arr[i] + " ");
		 }
	}

}

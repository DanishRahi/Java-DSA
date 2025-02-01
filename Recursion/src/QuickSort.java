
public class QuickSort {
	
public static void quickSort(int[] input, int startIndex, int endIndex) {
		//base casee 
	if(startIndex >= endIndex) {
		return;
	}
	int pivotPosition = partition(input, startIndex, endIndex);
	quickSort(input, startIndex, pivotPosition - 1);
	quickSort(input, pivotPosition + 1, endIndex);
}

	public static int partition(int[] input, int startIndex, int endIndex) {
	
		int pivotElement = input[startIndex];
		int smallerEleCount = 0;
		for(int i=startIndex+1; i<=endIndex; i++) {
			if(input[i]<pivotElement) {
				smallerEleCount++;
			}
		}
		  int temp=input[startIndex+smallerEleCount];
	        input[startIndex+smallerEleCount]=pivotElement;
	        input[startIndex]=temp;
	        
	        int i=startIndex;
	        int j=endIndex;
	        while(i<j)
	        {
	            if (input[i]<pivotElement)
	            {
	                i++;
	            }
	            else if (input[j]>=pivotElement)
	            {
	                j--;
	            }
	            else
	            {
	                temp=input[i];
	                input[i]=input[j];
	                input[j]=temp;
	                i++;
	                j--;
	            }
	        }
	        
	        return startIndex+smallerEleCount;
}

	public static void main(String[] args) {
		int arr[] = {3,5,6,1,2,4,9};
		quickSort(arr, 0, arr.length-1);
		 for(int i = 0; i < arr.length; i++) {
			 System.out.println(arr[i] + " ");
		 }
	}

}

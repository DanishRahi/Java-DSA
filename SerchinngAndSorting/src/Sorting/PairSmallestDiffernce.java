package Sorting;

import java.util.Arrays;

public class PairSmallestDiffernce {
	
	  public static int smallestDifferencePair(int []arr1, int n, int []arr2, int m) {

	        Arrays.sort(arr1);
	        Arrays.sort(arr2);

	        int i = 0, j = 0;
	        int minDiff = Integer.MAX_VALUE;

	        while (i < n && j < m) {
	            int currentDiff = Math.abs(arr1[i] - arr2[j]);

	            if (currentDiff < minDiff) {
	                minDiff = currentDiff;
	            }

	            if (arr1[i] < arr2[j]) {
	                i++;
	            } else {
	                j++;
	            }
	        }

	        return minDiff;
	    }

	public static void main(String[] args) {
		  int[] arr1 = {1, 2, 9};
	        int n = 3;
	        int[] arr2 = {5, 6};
	        int m = 2;

	        int result = smallestDifferencePair(arr1, n, arr2, m);
	        System.out.println(result); 

	}

}

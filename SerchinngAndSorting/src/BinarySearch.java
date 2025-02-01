import java.util.Scanner;

public class BinarySearch {
	
	
	public static int binarSearch(int[] input, int elem) {
		int start  = 0;
		int end = input.length;
		while(start <= end) {
			int mid = (start + end)/2;
			if(elem == input[mid]) {
				return mid;
			}else if(elem > input[mid]) {
				start = mid + 1;
			}else {
				end = mid - 1;
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int size = s.nextInt();

	        int[] input = new int[size];
	        System.out.println("Enter the elements of the array in sorted order:");
	        for (int i = 0; i < size; i++) {
	            input[i] = s.nextInt();
	        }

	        System.out.print("Enter the element to search: ");
	        int searchElement = s.nextInt();

	        int index = binarSearch(input, searchElement);
	        
	        if (index != -1) {
	            System.out.println("Element found at index: " + index);
	        } else {
	            System.out.println("Element not found in the array.");
	        }
	    }
	}
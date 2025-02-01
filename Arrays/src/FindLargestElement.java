import java.util.* ;
import java.io.*;
  

public class FindLargestElement {

    static int largestElement(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for(int i= 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;

    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int arr[] = {1,2,3,4,5};
         int n = arr.length;
        int result = largestElement(arr, n);
        
		 System.out.print(result);
	
        
    }
}
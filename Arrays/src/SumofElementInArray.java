import java.util.Scanner;

public class SumofElementInArray {
	
	
	public static int sum(int[] arr) {
		
	
		Scanner s = new Scanner(System.in);
		int sum = 0;
//		int size = s.nextInt();
		for(int i=0; i< arr.length; i++) {
			sum +=  arr[i];
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8};
		int result = sum(arr);
		System.out.println(result);
		
	

	}
}

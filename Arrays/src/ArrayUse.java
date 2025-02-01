import java.util.Scanner;

public class ArrayUse {
	
	public static int[] takeInput() {
		Scanner s  = new Scanner(System.in);
		int size = s.nextInt();
		int input[] = new int[size];
		for(int i =0; i < size; i++) {
			input[i] = s.nextInt();
			
		}
		return input;
	}
	
	public static void print(int input[]) {
		int size = input.length;
		for(int i=0; i < size ; i++) {
			System.out.print(input[i] + " ");
		}
		System.out.println();
		 
	}
	
	
	public static void incrementArray(int input[]) {
		input = new int[5];
		for(int i = 0; i < input.length; i++) {
			input[i]++;
		}
	}
 public static void main(String[] args) {

	 int arr[] = {1, 2, 3, 4, 5};
	 incrementArray(arr);
	 print(arr);
//	 int arr[] = takeInput();
//	 print(arr);
//	 System.out.println(arr);

//	int n = 10;
//	 int arr[] = new int[n];
//	 arr[0] = 15;
//	 System.out.println(arr[0]);
//	 System.out.println(arr[5]);
//
//	 char chArray[] = new char[11];
//	 chArray[0] = 'a';
//	 double dArray[] = new double[12];
//	 dArray[0] = 5.0;
//
//	 
//	 System.out.println(chArray[0]);
//	 System.out.println(dArray[0]);
	 
	
	
	
}
}

package functions;

public class DivideNumber {
	
	public static int divideNumber(int num, int deno) {
		if(deno == 0) {
			return Integer.MAX_VALUE;
		}
		return num / deno;

	}
	
	public static void printDivisionResult(int num, int deno) {
		if(deno == 0) {
			// exit the function
			System.out.println("Divivsion Zero is not allowed");
			return;
		}
		System.out.println(num / deno);
	}

	public static void main(String[] args) {
		int num = 8;
		int deno = 0;
		printDivisionResult(num, deno);
//		int result = divideNumber(num, deno);
//		System.out.println(result);

	}

}

package functions;

public class FunctionOverloading{
	
	public static int sum(int a, int b) {
		int result = a +b;
		return result;
	}
	private static double sum(double a, double b) {
		double result = a +b;
		return result;
	}
	

	public static int sum(int a) {
		return a + 1;
	}
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		System.out.println(sum(a));
		System.out.println(sum(a,b));
		System.out.println(sum(10.1, 1.0));
	}

	

}

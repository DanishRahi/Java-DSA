
public class CalculatePower {

	public static int power(int x, int n) {
		if(n==0) {
			return 1;
		}
		int smallOutput = power(x, n-1);
		int output = x*smallOutput;
		return output;
	}
	
	public static void main(String[] args) {
		int n = 3;
		int x = 4;
		System.out.println(power(n, x));
	}
}


public class GeomartixSum {
	
	public static double power(int a, int x) {
		if(a==1) {
			return a;
		}
		double small_output = power(a-1,x);
		double ans = small_output*x;
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package functions;

import java.util.Scanner;

public class NcR {
	
	public static int factorial(int n) {
		int  ans = 1;
		for( int i = 1; i <= n; i++) {
			ans = ans * i;
			
		}
		return ans;
	}
	// CHECK ISPRIME Function or not;
//	public static boolean isPrime(int n) {
//		int d  = 2;
//		while( d < n) {
//			if(n % d == 0) {
//				return false;
//			}
//			d++;
//		}
//		return true;
//	}
	
	
//	public static void printTillN(int n) {
//		for(int i = 1; i <= n; i++) {
//			System.out.println(i);
//		}
//	}

	public static void main(String[] args) {
		
//		int n = 10, r = 6;
//		int factn=1,factr=1,factnr=1;
//		for(int i =2; i<= n; i++) {
//			factn*=i;
//			if(i<=r)
//				factr*=i;
//			if(i<=n-r)
//				factnr*=i;
//		}
//		int ncr = factn/(factr*factnr);
//		System.out.println(ncr);
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r = s.nextInt();
		
//	boolean ansPrime = isPrime(5);
//	System.out.println(ansPrime);
		
		int num = factorial(n);
		
		int den1 = factorial(r);
		
		int den2 = factorial(n - r);
		
		int ans = num /(den1 * den2);
		System.out.println(ans);
	}

}

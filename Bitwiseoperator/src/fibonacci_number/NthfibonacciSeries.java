package fibonacci_number;

import java.util.Scanner;

public class NthfibonacciSeries {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int f1 = 1;
		int f2 = 1;
		int c = 0;
		if(n==1 || n==2) {
			c =1;
		}else {
			for(int i = 2; i <n; i++) {
				c = f1+f2;
				f1=f2;
				f2=c;
			}
			
		}
		System.out.println(c);
	}
}


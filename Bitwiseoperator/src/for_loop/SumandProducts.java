package for_loop;

import java.util.Scanner;

public class SumandProducts {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int C = s.nextInt();
		
		if(C == 1) {
			int totalSum = 0;
			for(int i = 1; i <= N; i++) {
				totalSum += i;
			}
			System.out.println(totalSum);
		}else if( C == 2) {
			int product = 1;
			for(int i = 1; i <= N; i++) {
				product *= i;
			}
			System.out.println( product);
		}else {
			System.out.println(-1);
		}

	}

}

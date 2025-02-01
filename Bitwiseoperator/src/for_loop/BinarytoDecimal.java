package for_loop;

import java.util.Scanner;

public class BinarytoDecimal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int ans = 0;
		int count = 0;
		while (N > 0) {
			int rem = N % 10;
			ans = ans + (int) rem * (int) Math.pow(2, count);
			count = count + 1;
			N = N / 10;

			System.out.println("");
		}
		System.out.println(ans);
	}

}

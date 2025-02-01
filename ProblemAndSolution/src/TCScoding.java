import java.util.Scanner;

public class TCScoding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input
		int n = scanner.nextInt();
		long[] numbers = new long[n + 1];
		for (int i = 0; i <= n; i++) {
			numbers[i] = scanner.nextLong();
		}

		// Find and print the result
		long result = findSmallestPrime(numbers); 
		if (result == -1) {
			System.out.println("None");
		} else {
			System.out.println(result);
		}
	}

	private static boolean isPrime(long num) {
		if (num < 2) {
			return false;
		}
		for (long i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	private static long findSmallestPrime(long[] numbers) {
		long q = Long.MAX_VALUE;
		for (long num : numbers) {
			q = Math.min(q, num);
		}

		for (long p = q; p < 10000000000L; p++) {
			boolean valid = true;
			for (long num : numbers) {
				if (num != q && p % num != q) {
					valid = false;
					break;
				}
			}
			if (valid && isPrime(p)) {
				return p;
			}
		}
		return -1;
	}

}

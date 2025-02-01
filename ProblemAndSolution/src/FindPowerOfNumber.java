import java.util.Scanner;

public class FindPowerOfNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int n = scan.nextInt();
		int ans = 1;
		if(x == 0) {
			if(n==0) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
		else {
			for(int i = 0; i <n; i++) {
				ans = ans*x;
			}
				System.out.println(ans);
		}
	}

}

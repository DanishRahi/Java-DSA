package break_continue;

import java.util.Scanner;

public class BreakandContinue {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		
		int d = 2;
		boolean divided = false;

		while(d<n) {
			if(n%2 == 0) {
				divided = true;
				break;
			}
			d = d +1;
		}
		if(divided) {
			System.out.println("Not prime");
		}else {
			System.out.println("prime");
		}
	}

}

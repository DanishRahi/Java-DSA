package patterns;

import java.util.Scanner;

public class characterpatterns {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i =1;
		int startingchar = (char)('A'-i+1);

		while(i<=n) {
			int j = 1;

			while(j<=i) {
				System.out.print('A');
				j++;
			}
			System.out.println();
			i++;
		}
		
		
	}

}

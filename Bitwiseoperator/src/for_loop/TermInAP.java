package for_loop;

import java.util.Scanner;

public class TermInAP {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int count = 0;
		int N = 1;
		
		while(count < x){
			int term = 3 * N + 2;
			if( term % 4 != 0){
				System.out.print(term + " ");
				count++;
			}
			N++;
		}
		

	}

}

package for_loop;

import java.util.Scanner;

public class SumTillN {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		/*int i = 1;
		int sum = 0;
		while(i <= n) {
			sum = sum + i;
			i = i + 1;
		}
		System.out.println(sum);
		*/
		
//		int sum = 0;
//		for(int i = 1; i<=n; i = i+1) {
//		    sum = sum + i;    
//		}
//		System.out.println(sum);

//			for(int i = 1; i< 5; i = i+1) {
//				System.out.println(i + " ");
//
//				i = i -1;
//
//			}

		
		for(int i =0; i<2; i = i+1) {
			for(int j =0; j<2; j = j+1) {
				if(j == 1)
					break;
				System.out.println(j + " ");
				
			}
		}
	}

}

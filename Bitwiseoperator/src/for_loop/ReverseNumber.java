package for_loop;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int reversedNum = 0;
		while(num > 0) {
		int	digit = num % 10;
		reversedNum = reversedNum * 10  + digit;
		num = num / 10;
		}
		
		System.out.println(reversedNum);
	}
	

}

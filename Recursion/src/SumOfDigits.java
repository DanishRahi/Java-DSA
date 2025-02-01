import java.util.Scanner;

public class SumOfDigits {
 static int sum=0;
	public static int sumOfDigits(int input){
		// Write your code here
		if(input == 0) {
			return 0;
			
		}else {
			return (input%10+sumOfDigits(input/10));
		}
	}
	public static void main(String[] args) {
		System.out.print("please provide the number");
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		System.out.println("sum of " +input+ " is " +sumOfDigits(input) );
		
	}
}
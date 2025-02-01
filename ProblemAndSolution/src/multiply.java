import java.util.Scanner;

public class multiply {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i =0; i < 10; i++) {
			System.out.println(n*i);
		}
		scan.close();
	}

}

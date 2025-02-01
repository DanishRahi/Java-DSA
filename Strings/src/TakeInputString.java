import java.util.Scanner;

public class TakeInputString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		str = s.next();
//		str = s.nextLine();
//		System.out.println(str + " " + str.length());
		int i = s.nextInt();
		String str2 = s.nextLine();
		System.out.println(str2 + " " + str2.length());

	}

}

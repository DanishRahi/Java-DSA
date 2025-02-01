package functions;

public class Increment {
	
//	public static void doubleValue(int a) {
//		
//		// Pass by value;
//		a = a * 2;
//		
//	}
//
//	public static void main(String[] args) {
//		int a = 10;
//	    doubleValue(a);
//		System.out.println(a);
//		
//
//	}
	public static void main(String[] args) {
		int a = 5;
		func(a);
		System.out.println(a);
	}

public static int func(int a) {
	
	a+= 10;
	return a;
	
}

}

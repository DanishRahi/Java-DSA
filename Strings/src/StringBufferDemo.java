
public class StringBufferDemo {

	public static void main(String[] args) {
		
			
		StringBuffer str = new StringBuffer("abc"); // String Buffer is muatiable;
			str.setCharAt(0, 'd');
			str.append("def"); // Append means adding element in string
			
			System.out.println(str + " " + str.length());
	}

}

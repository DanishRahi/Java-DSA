
public class ReplaceCharacter {
	
	public static String replaceCharacter(String input, char c1, char c2) {
		//BASE CASE
		if(input.length() == 0) {
			return input;
		}
		char firstChar = input.charAt(0);
		if(firstChar != c1) {
			return firstChar + replaceCharacter(input.substring(1),c1, c2);
		}else {
			firstChar = c2;
			return c2 + replaceCharacter(input.substring(1), c1, c2);
		}
		
	}



	public static void main(String[] args) {
		String str = "xabaxbahaxxv";
		char c1 = 'x';
		char c2 = 'a';
		System.out.println(replaceCharacter(str, c1, c2));
		

	}

}

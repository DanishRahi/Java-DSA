
public class ReverseEachWord {
	
	public static String reverseEachWord(String str) {
		String ans = "";
		int currentWordStart = 0;
		int i = 0;
		for(; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				// Reverse Current Word
				int currentWordEnd = i - 1;
				String reversedWord = "";
				for(int j = currentWordStart; j<= currentWordEnd; j++) {
					reversedWord = str.charAt(j) + reversedWord;
				}
				
				// Add it final string(ans)
				ans += reversedWord + " ";
				currentWordStart = i+1;
			}
		}
		
		int currentWordEnd = i - 1;
		String reversedWord = "";
		for(int j = currentWordStart; j<= currentWordEnd; j++) {
			reversedWord = str.charAt(j) + reversedWord;
		}
		
		// Add it final string(ans)
		ans += reversedWord;
		
		return ans;
	}

	public static void main(String[] args) {
		String str = "abc def ghi";
		System.out.println(reverseEachWord(str));

	}

}

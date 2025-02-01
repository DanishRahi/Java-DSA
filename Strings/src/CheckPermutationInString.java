
public class CheckPermutationInString {
	
	public static boolean isPermutation(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		
		int[] charCount = new int[254];
		for(char ch : str1.toCharArray()) {
			charCount[ch]++;
		}
		for(char ch : str2.toCharArray()) {
			charCount[ch]--;
		}
		for(int count : charCount) {
			if(count != 0) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		String str1 = "heart";
		String Str2 = "ehrat";
		System.out.println(isPermutation(str1, Str2));
		

	}

}


public class Subsequence {

	public static String[] findSubsequence(String str) {
		if(str.length() == 0) {
			String ans[] = {""};
			return ans;
		}
		String smallAns[] = findSubsequence(str.substring(1));
		String ans[] = new String[2 * smallAns.length];
		
		int k = 0;
		// copy element in array
		for(int i = 0; i<smallAns.length; i++) {
			ans[k] = smallAns[i];
			k++;
		}
		//add first character 
		for(int i = 0; i< smallAns.length; i++) {
			ans[k] = str.charAt(0) + smallAns[i];
			k++;
		}
		return ans;
	}
	public static void main(String[] args) {
		String str = "xyz";
		String ans[] = findSubsequence(str);
		for(int i = 0; i< ans.length; i++) {
			System.out.println(ans[i]);
		}
	}

}

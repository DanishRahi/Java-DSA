
public class RemoveX {
	
	public static String removeX(String str) {
		//BASE CASE
		if(str.length() == 0) {
			return str;
		}
		String ans = "";
		if(str.charAt(0) != 'x') {
			ans = ans + str.charAt(0);
		}
		String smallAns = removeX(str.substring(1));
		return ans + smallAns;
	}

	public static void main(String[] args) {
		String str = "xabaxbahaxxv";
		System.out.println(removeX(str));
		

	}

}

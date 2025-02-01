
public class StringPaliindrome {

	public static String reverse(String str) {
		
            String reverse;
		
		for(int i = 0;  i>= 0; i++) {
			for(int j  = str.length() - 1; j>=0; j--) {
				if(str.charAt(i) != (j)){
					return str;
				}else {
					i++;
					j++;
				}
					
				
			}
			return str;
			
			
		}
	}
	
	
	
	public static void main(String[] args) {
		

	}

}

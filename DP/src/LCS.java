
public class LCS {

	
	public static int lcs(String s, String t) {
		
		//Base case
		if(s.length()== 0 || t.length() == 0){
			return 0;
		}
		
		if(s.charAt(0) == t.charAt(0)) {
			return 1+ lcs(s.substring(1), t.substring(1));
			
		}else {
			int op1 = lcs(s, t.substring(1));
			int op2 = lcs(s.substring(1), t);
			int op3 = lcs(s.substring(1), t.substring(1));
			 return Math.max(op1, Math.max(op2, op3));
		}
	}
	// Memoization ; 
	
	public static int lcsM(String s, String t) {
		int storage[][] = new int [s.length()+1] [t.length()+1];
		
		// for first postion is empty .....
		for(int i = 0; i<s.length() + 1; i++) {
			for(int j = 0; j< t.length() + 1; j++) {
				storage[i][j] = -1;
			}
		}
		return lcsM(s,t,storage);
	}
	
	
	
	private static int lcsM(String s, String t, int[][] storage) {
		
		int m = s.length();
		int n = t.length();
		
		if(storage[m][n] != -1) {
			return storage[m][n];
		}
		
		//Base case
		if(m == 0 || n == 0) {
			storage[m][n] = 0;
			return storage[m][n];
		}
		
		if(s.charAt(0) == t.charAt(0)) {
			storage[m][n] = 1 + lcsM(s.substring(1), t.substring(1), storage);
		}else {
			int op1 = lcsM(s, t.substring(1), storage);
			int op2 = lcsM(s.substring(1), t , storage);
			storage [m][n] = Math.max(op1, op2);
			
		}
		return storage [m][n];
	}

	
	public static int lcsDP(String s, String t) {
		int m  = s.length();
		int n =  s.length();
		int storage[][] = new int[m+1][n+1];
			for(int i = 0; i <= m; i++) {
				storage[i][0] = 0;
			}
			
			for(int i = 0; i <= n; i++) {
				storage[0][i] = 0;
			}
			for(int i = 1; i <= m; i++) {
				for(int j = 1; j <= n; j++) {
					if(s.charAt(m-i) == t.charAt(n-j)) {
						storage[i][j] = 1+ storage[i-1][j-1];
					}else {
						storage[i][j] = Math.max(storage[i][j-1], storage[j][i-1]);
					}
				}
				
			}
			return storage[m][n];

	}

	public static void main(String[] args) {
		
		String s = "geigeigeifhi";
		String t = "geigeigeigeifgi";
		System.out.println(lcs(s,t));
		System.out.println(lcsM(s,t));
		System.out.println(lcsDP(s, t));
	}

}

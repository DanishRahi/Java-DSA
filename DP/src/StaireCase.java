
public class StaireCase {

	
	public static long staircase(int n) {
		 if(n<=1)
	            return 1;
	        if(n==2)
	            return 2;
	        
	        long dpCount[] = new long[n+1];
	        dpCount[0]=1;
	        dpCount[1]=1;
	        dpCount[2]=2;

	        
	        for (int i=3;i<=n;i++)
	        {
	            dpCount[i]=dpCount[i-1]+dpCount[i-2]+dpCount[i-3];
	                
	        }
	        return dpCount[n];
		}

	public static void main(String[] args) {
		int n = 4;
		System.out.println(staircase(n));
	}
	}
	



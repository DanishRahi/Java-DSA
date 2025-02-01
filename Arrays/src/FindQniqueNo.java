 
public class FindQniqueNo {
	
	
	
	 public static int findUnique(int[] arr){
	       
		 int count,val=0;
	        if (arr.length==1)
	        {
	            return arr[0];
	        }
	        outer:for (int i=0;i<arr.length;i++)
	        {
	            count=1;
	            
	            inner:for (int j=i+1;j<arr.length;j++)
	            {
	                if ((arr[i] == arr[j]) && (i != j))
	                {
	                    count=count+1;
	                }
	                
	                if (count==2)
	                {
	                    break inner;
	                }
	            }
	            
	            if (count==1)
	            {
	                val=arr[i];
	                break outer;
	            }
	            
	        }
	        return val;
	      
	    }
	



	public static void main(String[] args) {
		int arr[] = {1,3,1,3,6,7,9};
		
		print(arr);
		int unique = findUnique(arr);
		System.out.println(unique);
	}




	private static void print(int[] arr) {
		
		 for (int i : arr) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	}

}

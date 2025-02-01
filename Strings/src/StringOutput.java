
public class StringOutput {

	public static void main(String[] args) {
//		String a="coding",b="ninjas";
//		if(a.contains("ing"))
//		{
//		    a+=b;
//		}
//		else
//		{
//		    b+="ing";
//		}
//		System.out.print(a+b);
		
		String a = "coding";
		for(int i = 2; i<5; i++) {
			System.out.println(a.substring(i-1,i+1));
		}
	}

}

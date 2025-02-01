
public class CheckNumber {
	public static boolean checkNumber(int input[], int x) {

	
	  if (input.length==1)
      {
          if (input[0]==x)
          {
              return true;
          }
          else
          {
              return false;
          }
      }
      else if (input[input.length-1]==x)
      {
          return true;
      }
      int[] smallCheck = new int[input.length-1];
      for (int i=0;i<input.length-1;i++)
      {
          smallCheck[i]=input[i];
      }
      boolean output=checkNumber(smallCheck,x);
      return output;
	}

	public static void main(String[] args) {
		int input[] = {1,4,5,6,7};
		int x = 5;
		System.out.println(checkNumber(input, x));

	}

}

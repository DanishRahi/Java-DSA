
public class CountZero {

	static int count =0;
	public static int countZerosRec(int input) {
		if(input==0 && input/10==0 && input%10==0) { // Base case when input is zero
			return 1;
		}
		if(input==0) {
			return 0;
		}
		
		int digit = input%10;
		input = input/10;
		if(digit==0) {
			count=count+1;
		}
		int countz= countZerosRec(input);
		return count;
	}
	
	public static void main(String[] args) {
		int inputNumber = 4090;
		int zeroCount = countZerosRec(inputNumber);
		System.out.println("Number of zeros in " + inputNumber + " is: " + zeroCount);
		
	}

}

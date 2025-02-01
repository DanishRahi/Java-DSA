import java.util.Scanner;

public class CountWord {

	
	
	public static int countWords(String str) {	
		

		int count = 0;
		
		for(int i = 0; i<str.length(); i++){
			if(str.charAt(i) == ' '){
				count++;
			}
		}


      return (count+1);
	}

	public static void main(String[] args) {
	Scanner  s = new Scanner(System.in);
	System.out.println("Enter a string: ");
	String inputString = s.nextLine();
	int wordCount = countWords(inputString);
	System.out.println("Number of word: " + wordCount);
	}

}

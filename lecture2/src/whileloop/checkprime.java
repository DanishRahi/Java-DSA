package whileloop;

import java.util.Scanner;

public class checkprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s = new Scanner(System.in);
     System.out.println("Enter the number");
     int n = s.nextInt();
     int sum = 0;
     for (int i = 2; i<=n; i += 2) {
    	 sum += i;
    	 
     }
     System.out.println("sum of all even number from 1 to " + n + "is" + sum);
      }
	
}

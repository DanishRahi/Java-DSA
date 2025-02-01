package question;

import java.util.Scanner;

public class FHitnocelcius {

	public static void main(String[] args) {
   

		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter start Fahrenheit value: ");
		        int start = sc.nextInt();
		        System.out.print("Enter end Fahrenheit value: ");
		        int end = sc.nextInt();
		        System.out.print("Enter step size: ");
		        int step = sc.nextInt();
		        System.out.println("Fahrenheit\tCelsius");
		        for (int f = start; f <= end; f += step) {
		            double c = (5.0 / 9.0) * (f - 32);
		            System.out.println(f + "\t\t" + c);
		        }
		    }
		

	}


package functions;

public class TempConvtable {
	public static void printFahrenheitTable(int start, int end, int step) {
		/* Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print the specified output in required format. 
		 * Taking input is handled automatically. 
		 */
        for (int i=start;i<=end;i=i+step)
        {
            double cel = (5*(i-32))/9;
            System.out.println(i + " " + (int)cel);
        }
		
	}


}

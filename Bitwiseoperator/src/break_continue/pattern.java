package break_continue;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int n = 4;
//		int i = 1;
//		while(i<= n) {
//			int j = 1;
//			while(j<=n) {
//				System.out.print(j + " ");
//				j++;
//				if(j>i) {
//					break;
//				}
//			}
//			System.out.println();
//			
//			i++;
//		
//		}
		
		
		int i =1;
		while(i < 3) {
			int j =0;
			while(j <5) {
				j++;
				if(j == 3) {
					continue;
				}
				System.out.print(j + " ");
//				j++;
			}
			i++;
		}
	}

}

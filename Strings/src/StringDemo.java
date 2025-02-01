
public class StringDemo {

	public static void main(String[] args) {
		char arr[] = {'c','o','d','i','n','g'};
		String str = "coding";
		String str1 = "ninjas";
//		str = str.concat(str1);
//		str += str1;
		System.out.println(str.substring(1, 5));
		System.out.println(str.contains("ing"));
		System.out.println(str.compareTo(str1)); 
		System.out.println(str.equals(str1)); // for check equal or not;
		System.out.println(str1 + str); // string concetation;
//		System.out.println(str.length()); // String func 1;
//		System.out.println(str.charAt(3)); // string func 2
	}

}
 
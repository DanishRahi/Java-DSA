public class DuplicatesInString {

    public static String removeDuplicates(String s) {
        // Base case
        if (s.length() <= 1) {
            return s;
        }

        // Check if the first two characters are consecutive duplicates
        if (s.charAt(0) == s.charAt(1)) {
            // Skip the consecutive duplicates and recurse on the rest of the string
            return removeDuplicates(s.substring(1));
        } else {
            // Keep the current character and recurse on the rest of the string
            return s.charAt(0) + removeDuplicates(s.substring(1));
        }
    }

    public static void main(String[] args) {
        String str = "aabccba";
        
        
        String result = removeDuplicates(str);
        System.out.println(result);
    }
}

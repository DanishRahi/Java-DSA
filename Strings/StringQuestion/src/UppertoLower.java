public class UppertoLower {

    public static String replaceAdjacentDuplicates(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            result.append(currentChar);

            if (i < s.length() - 1 && currentChar == s.charAt(i + 1)) {
                // Replace adjacent duplicates with the same uppercase letter
                char upperCaseChar = Character.toUpperCase(currentChar);
                result.setCharAt(i, upperCaseChar);
                result.setCharAt(i + 1, upperCaseChar);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Example 1
        String example1 = "geeksforgeeks";
        System.out.println("Example 1: " + replaceAdjacentDuplicates(example1));

        // Example 2
        String example2 = "ggeeekk";
        System.out.println("Example 2: " + replaceAdjacentDuplicates(example2));
    }
}

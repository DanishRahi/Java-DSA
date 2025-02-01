package compilerDesign;

import java.util.Scanner;
import java.util.Stack;

public class tokengenerate {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		        String input = s.nextLine();

		        System.out.print("Enter a string to parse: ");

		        if (isValidParsing(input)) {
		            System.out.println("The string is a valid parsing expression.");
		        } else {
		            System.out.println("The string is not a valid parsing expression.");
		        }
		    }

		    public static boolean isValidParsing(String input) {
		        Stack<Character> stack = new Stack<>();

		        for (int i = 0; i < input.length(); i++) {
		            char c = input.charAt(i);

		            if (c == '(' || c == '[' || c == '{') {
		                stack.push(c);
		            } else if (c == ')' || c == ']' || c == '}') {
		                if (stack.isEmpty()) {
		                    return false;
		                } else {
		                    char top = stack.peek();
		                    if ((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')) {
		                        stack.pop();
		                    } else {
		                        return false;
		                    }
		                }
		            }
		        }

		        return stack.isEmpty();
		    }
	
	}



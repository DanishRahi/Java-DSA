package compilerDesign;
import java.util.*;

public class PRECEDENCEPARSE {



		public class OperatorPrecedenceParseTable {

		    // Function to check if a character is an operator
		    public static boolean isOperator(char ch) {
		        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
		    }

		    // Function to get the precedence level of an operator
		    public static int getPrecedence(char ch) {
		        if (ch == '+' || ch == '-') {
		            return 1;
		        } else if (ch == '*' || ch == '/') {
		            return 2;
		        } else {
		            return 0;
		        }
		    }

		    // Function to construct the operator precedence parse table
		    public static Map<Character, Map<Character, Character>> constructParseTable() {
		        // Declare the parse table as a Map of Maps
		        Map<Character, Map<Character, Character>> parseTable = new HashMap<>();

		        // Declare a stack to keep track of operators
		        Stack<Character> operatorStack = new Stack<>();

		        // Iterate over all possible combinations of operators and operands
		        for (char op1 = '+'; op1 <= '/'; op1++) {
		            for (char op2 = '+'; op2 <= '/'; op2++) {
		                // Push the first operator onto the stack
		                operatorStack.push(op1);

		                // Declare a vector to store the order of operators
		                List<Character> orderOfOperators = new ArrayList<>();
		                orderOfOperators.add(op1);

		                // Push the second operator onto the stack
		                operatorStack.push(op2);

		                // Add the second operator to the order of operators
		                orderOfOperators.add(op2);

		                // Iterate over the remaining operators and operands
		                for (char ch = 'a'; ch <= 'z'; ch++) {
		                    // If the current character is an operator, push it onto the stack
		                    if (isOperator(ch)) {
		                        operatorStack.push(ch);
		                    } else {
		                        // If the current character is an operand, pop operators from the stack
		                        // until the stack is empty or the top operator has lower precedence than
		                        // the current operator
		                        while (!operatorStack.empty() && isOperator(operatorStack.peek()) &&
		                                getPrecedence(operatorStack.peek()) >= getPrecedence(ch)) {
		                            orderOfOperators.add(operatorStack.pop());
		                        }

		                        // Reverse the order of operators and add it to the parse table
		                        for (int i = orderOfOperators.size() - 1; i >= 1; i--) {
		                            char op = orderOfOperators.get(i - 1);
		                            char nextOp = orderOfOperators.get(i);

		                            if (!parseTable.containsKey(op)) {
		                                parseTable.put(op, new HashMap<Character, Character>());
		                            }

		                            parseTable.get(op).put(ch, nextOp);
		                        }

		                        // Push the operand onto the stack
		                        operatorStack.push(ch);
		                    }
		                }

		                // Pop the remaining operators from the stack and add them to the parse table
		                while (!operatorStack.empty()) {
		                    char op = operatorStack.pop();

		                    if (isOperator(op)) {
		                        for (int i = orderOfOperators.size() - 1; i >= 1; i--) {
		                            char prevOp = orderOfOperators.get(i - 1);
		                            char nextOp = orderOfOperators.get(i);

		                            if (!parseTable.containsKey(prevOp)) {
		                                parseTable.put(prevOp, new HashMap<Character, Character>());
		                            }

		                            parseTable.get(prevOp).put(op, nextOp);
		                        }
		                    }
		                }
		            }
		        }

		        return parseTable;
		    }

		    public static void main(String[] args) {

		
		    }
		}
}

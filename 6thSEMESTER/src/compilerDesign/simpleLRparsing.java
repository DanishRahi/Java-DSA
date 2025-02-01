package compilerDesign;
import java.util.*;

public class simpleLRparsing {



		public class SimpleLRParser {

		    // Production rules
		    static String[] productionRules = {"E->E+T", "E->T", "T->T*F", "T->F", "F->(E)", "F->i"};

		    // Parsing table
		    static Map<String, Map<String, String>> parsingTable = new HashMap<>();

		    public static void main(String[] args) {
		        // Construct parsing table
		        constructParsingTable();

		        // Input string to parse
		        String input = "i+i*i";

		        // Stack to keep track of states
		        Stack<String> stateStack = new Stack<>();
		        stateStack.push("0");

		        // Stack to keep track of symbols
		        Stack<String> symbolStack = new Stack<>();
		        symbolStack.push("$");

		        // Current input symbol
		        int symbolIndex = 0;

		        // Parse the input string
		        while (!stateStack.empty()) {
		            String state = stateStack.peek();
		            String inputSymbol = String.valueOf(input.charAt(symbolIndex));

		            if (parsingTable.containsKey(state) && parsingTable.get(state).containsKey(inputSymbol)) {
		                String action = parsingTable.get(state).get(inputSymbol);

		                if (action.startsWith("S")) {
		                    // Shift
		                    stateStack.push(action.substring(1));
		                    symbolStack.push(inputSymbol);
		                    symbolIndex++;
		                } else if (action.startsWith("R")) {
		                    // Reduce
		                    int productionIndex = Integer.parseInt(action.substring(1)) - 1;
		                    String productionRule = productionRules[productionIndex];

		                    String[] productionRuleTokens = productionRule.split("->");
		                    String nonTerminal = productionRuleTokens[0];
		                    String[] productionSymbols = productionRuleTokens[1].split("");

		                    for (int i = 0; i < productionSymbols.length; i++) {
		                        stateStack.pop();
		                        symbolStack.pop();
		                    }

		                    String topState = stateStack.peek();
		                    symbolStack.push(nonTerminal);
		                    stateStack.push(parsingTable.get(topState).get(nonTerminal));
		                } else if (action.equals("ACC")) {
		                    // Accept
		                    System.out.println("Input string is valid.");
		                    return;
		                }
		            } else {
		                System.out.println("Input string is invalid.");
		                return;
		            }
		        }

		        System.out.println("Input string is invalid.");
		    }

		    // Construct parsing table
		    public static void constructParsingTable() {
		        // State 0
		        Map<String, String> state0 = new HashMap<>();
		        state0.put("i", "S5");
		        state0.put("(", "S4");
		        state0.put("E", "1");
		        state0.put("T", "2");
		        state0.put("F", "3");
		        parsingTable.put("0", state0);

		        // State 1
		        Map<String, String> state1 = new HashMap<>();
		        state1.put("+", "S6");
		        state1.put("$", "ACC");
		        parsingTable.put("1", state1);

		        // State 2
		        Map<String, String> state2 = new HashMap<>();
		        state2.put("+", "R2");
		        state2.put("*", "S7");
		        state2.put(")", "R2");
		        state2.put("$", "R2");
		        parsingTable.put("2", state2);

		        // State 3
		        Map<String, String> state3 = new HashMap<>();
		        state3.put("+", "R4");
		        state3.put("*", "R4");
		        state3.put(")", "R4");
		        state3.put("$", "R4");

		
	}
}
}
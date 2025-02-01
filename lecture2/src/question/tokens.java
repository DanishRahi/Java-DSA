package question;

import java.util.ArrayList;
import java.util.List;

public class tokens {

	public static void main(String[] args) {

	    String lexeme = "2 + 3 * 4 - 5";
        List<Token> tokens = generateTokens(lexeme);
        System.out.println(tokens);
    }
    
    public static List<Token> generateTokens(String input) {
        List<Token> tokens = new ArrayList<Token>();
        String[] lexemes = input.split("\\s+");
        for (String lexeme : lexemes) {
            Token token = null;
            if (lexeme.equals("+")) {
                token = new Token(TokenType.ADD, lexeme);
            } else if (lexeme.equals("-")) {
                token = new Token(TokenType.SUBTRACT, lexeme);
            } else if (lexeme.equals("*")) {
                token = new Token(TokenType.MULTIPLY, lexeme);
            } else if (lexeme.equals("/")) {
                token = new Token(TokenType.DIVIDE, lexeme);
            } else if (lexeme.matches("[0-9]+")) {
                token = new Token(TokenType.NUMBER, lexeme);
            }
            if (token != null) {
                tokens.add(token);
            }
        }
        return tokens;
    }
}

class Token {
    TokenType type;
    String lexeme;
    
    public Token(TokenType type, String lexeme) {
        this.type = type;
        this.lexeme = lexeme;
    }
    
    public String toString() {
        return "[" + type + ", " + lexeme + "]";
    }
}

enum TokenType {
    ADD, SUBTRACT, MULTIPLY, DIVIDE, NUMBER


		
		
		
		
	}



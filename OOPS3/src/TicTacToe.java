import java.util.Scanner;

public class TicTacToe {

		// TODO Auto-generated method stub

	private Player player1, player2;
	private Board board;
	
	public static void main(String args[]) {
		TicTacToe t = new TicTacToe();
		t.startGame();
	}
	
	public void startGame() {
		Scanner s = new Scanner(System.in);
		// player input
		player1 = takeplayerinput(1);
		player2 = takeplayerinput(2);
		while(player1.getSymbol() == player2.getSymbol()) {
			System.out.println("Symbol Already taken !! pick another symbol !!");
			char symbol = s.next().charAt(0);
			player2.setSymbol(symbol);
		}
		// Create Board
		
		board = new Board(player1.getSymbol(), player2.getSymbol());
			
		
		// Conduct the Game
		boolean player1Turn = true;
		int status = Board.INCOMPLETE;
		while(status == Board.INCOMPLETE || status == Board.INVALID){
			if(player1Turn) {
				System.out.println("Player 1 - " + player1.getName() + "' s trun");
				System.out.println("Enter x: ");
				int x = s.nextInt();
				System.out.println("Enter y: ");
				int y = s.nextInt();
				status = board.move(player1.getSymbol(), x, y);
				 if(status != Board.INVALID) {
					 player1Turn = false;
					 board.print();
				 }else {
					 System.out.println("Invalid Move !! Try Again !!");
				 }
			}else {
					System.out.println("Player 2 - " + player2.getName() + "' s trun");
					System.out.println("Enter x: ");
					int x = s.nextInt();
					System.out.println("Enter y: ");
					int y = s.nextInt();
					 status = board.move(player2.getSymbol(), x, y);
					 if(status != Board.INVALID) {
					  player1Turn = true;
						board.print(); 
					 }else {
						 System.out.println("Invalid Move !! Try Again !!");
					 }
					 
			
			}
		}
		
		if(status  == Board.PLAYER_1_Wins) {
			System.out.println("Player 1 - " + player1.getName() +" win !!");
		}else {
			if(status  == Board.PLAYER_2_Wins) {
				System.out.println("Player 2 - " + player2.getName() +" win !!");
			}else {
				System.out.println("Draw !!");
			}
		}
		
	}
	
	
	
	private Player takeplayerinput(int num) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Player " + num + " name: ");
		String name = s.nextLine();
		System.out.println("Enter Player " + num + " symbol: ");
		char symbol = s.next().charAt(0);
		Player p = new Player(name, symbol);
		return p;
		
	}
	
}

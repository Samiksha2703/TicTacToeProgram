package tictactoe;

public class TicTacToeGame {
	
	// UC1 - creating method to initialize indices with blank space
		static char[] createBoard() {
			char[] board = new char[10];
			for (int index = 1; index < board.length; index++) {
				board[index] = ' ';
			}
			return board;
		}
	
		public static void main(String[] args) {

			System.out.println("Welcome to TicTacToe Game");
			createBoard();
}
}
package tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
	// UC1 - creating method to initialize indices with blank space
	static char[] createBoard() {
		char[] board = new char[10];
		for (int index = 1; index < board.length; index++) {
			board[index] = ' ';
		}
		return board;
	}

	// UC2 - Creating method to take the input from user
	public static void userInput() {
		char computer = 'O';
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the input X/O");
		char userInput = input.next().toUpperCase().charAt(0);

		if (userInput == 'X') {
			computer = 'O';
		} else if (userInput == 'O') {
			computer = 'X';
		} else {
			System.out.println("Invalid input");
		}
		input.close();
	}

	// UC3 - Creating method to print the array elements
	public static void checkBoard() {
		char[][] checkBoard = { { '-', ' ', '|', ' ', '-', ' ', '|', ' ', '-' },
				{ '-', ' ', '|', ' ', '-', ' ', '|', ' ', '-' }, { '-', ' ', '|', ' ', '-', ' ', '|', ' ', '-' } };
		for (int i = 0; i < checkBoard.length; i++) {
			System.out.println(checkBoard[i]);
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to TicTacToe Game");
		createBoard();
		userInput();
		checkBoard();
	}
}
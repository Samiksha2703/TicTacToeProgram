package tictactoe;

import java.util.Scanner;

public class TicTacToeGame {

	static char[] board = new char[10];
	static char computer = 'O';
	static int initialize = 1;

	// UC1 - creating method to initialize indices with blank space
	static char[] createBoard() {
		for (int index = initialize; index < board.length; index++) {
			board[index] = ' ';
		}
		return board;
	}

	// UC2 - Creating method to take the input from user
	public static void userInput() {
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
	public static void displayBoard() {
		for (int index = initialize; index <=board.length - initialize; index++) {
			System.out.println(board[index] + "|" + board[index + 1] + "|" + board[index + 2]);
			initialize = initialize + 3;
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to TicTacToe Game");
		createBoard();
		userInput();
		displayBoard();
	}
}
package tictactoe;

import java.util.Scanner;

public class TicTacToeGame {

	static char[] board = new char[10];
	static char computer = 'O';
	static int initialize = 1;
	static char userInput;

	static Scanner input = new Scanner(System.in);

	// UC1 - creating method to initialize indices with blank space
	static char[] createBoard() {
		for (int index = initialize; index < board.length; index++) {
			board[index] = ' ';
		}
		return board;
	}

	// UC2 - Creating method to take the input from user
	public static void userInput() {
		System.out.println("Enter the input X/O");
		userInput = input.next().toUpperCase().charAt(0);

		if (userInput == 'X') {
			computer = 'O';
		} else if (userInput == 'O') {
			computer = 'X';
		} else {
			System.out.println("Invalid input");
		}
	}

	// UC3 - Creating method to print the array elements
	public static void displayBoard() {
		for (int index = initialize; index <= board.length - initialize; index++) {
			System.out.println(board[index] + "|" + board[index + 1] + "|" + board[index + 2]);
			initialize = initialize + 3;
		}
	}

	// UC4 - Creating method to ask the input and check the index is vacant
	public static void checkingindex() {
		System.out.println("Enter the index from 1 to 9");
		int userIndex = input.nextInt();
		if (board[userIndex] == ' ') {
			System.out.println("Enter the value O/X");
			userInput = input.next().toUpperCase().charAt(0);
			board[userIndex] = userInput;
		} else {
			System.out.println("The index you are entered is not vacant check for other index");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to TicTacToe Game");
		createBoard();
		userInput();
		displayBoard();
		checkingindex();
	}
}
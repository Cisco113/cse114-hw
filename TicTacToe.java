// Cisco An-Torres 114619732
import java.util.*;

public class TicTacToe {
	public static int GRID_SIZE = 3;
	
	// main program of the tictactoe. reads where user wants to put their x or o on respective turns. if x or o already exists at user inputed location, it makes the user choose a different location.
	// once there is 3 in a row, it will end the game.
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		char [][] grid = new char[GRID_SIZE][GRID_SIZE];
		for (int i = 0; i < GRID_SIZE; i++) {
			for (int j = 0; j < GRID_SIZE; j++) {
				grid[i][j] = '-';
			}
		}
		
		
		boolean notwon = true;
		for (int i = 0; notwon; i++) {
			System.out.println("Enter the row and column (1 - 3): ");
			int row = input.nextInt() - 1;
			int col = input.nextInt() - 1;
			
			char x = 'x';
			char o = 'o';		
			
			if (grid[row][col] == x || grid[row][col] == o) {
				printBoard(grid);
				System.out.println("This spot is taken. Retry!");
				System.out.println();
				i--;
				continue;
			}
			
			if (i % 2 == 0) {
				grid[row][col] = x;
			} else {
				grid[row][col] = o;
			}
			
			printBoard(grid);
			if (gameWinner(grid) == 0) {
				System.out.println("You have won!");
				notwon = false;
			}
			System.out.println();
		}
		input.close();
	}
	
	// this method just prints the tictactoe board
	public static void printBoard(char[][] a) {
		for (int i = 0; i < GRID_SIZE; i++) {
			for (int j = 0; j < GRID_SIZE; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	// this method keeps track of the board and sees if there is a winner. if there's a winner it returns 0 and if no winner it returns -1.
	public static int gameWinner(char[][] a) {
		for (int i = 0; i < GRID_SIZE; i++) {
			if (a[i][0] == a[i][1] && a[i][1] == a[i][2] && a[i][0] != '-') {
				return 0;
			}
		}
		for (int i = 0; i < GRID_SIZE; i++) {
			if (a[0][i] == a[1][i] && a[1][i] == a[2][i] && a[0][i] != '-') {
				return 0;
			}
		}
		
		if (a[0][0] == a[1][1] && a[1][1] == a[2][2] && a[0][0] != '-') {
			return 0;
		}
		if (a[0][2] == a[1][1] && a[1][1] == a[2][0] && a[0][2] != '-') {
			return 0;
		}
		return -1;
	}
	

}

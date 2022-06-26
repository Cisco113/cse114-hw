// Cisco An-Torres 114619732
import java.util.*;

// reads numbers for both matrix arr1 and arr2. used the numbers in method multiplyMatrix.
public class MultiplyMatrices {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		double [][] arr1 = new double[3][3];
		double [][] arr2 = new double[3][3];
		System.out.println("Enter 9 numbers for the first array: ");
		for (int row = 0; row < arr1.length; row++) {
			for (int column = 0; column < arr1[row].length; column++) {
				arr1[row][column] = input.nextDouble();
			}
		}
		System.out.println("Enter 9 numbers for the second array: ");
		for (int row = 0; row < arr2.length; row++) {
			for (int column = 0; column < arr2[row].length; column++) {
				arr2[row][column] = input.nextDouble();
			}
		}		
		input.close();
		multiplyMatrix(arr1, arr2);
		
	}
	// made a new matrix, c, to add my multiplied numbers to. made 3 nested for loops. for k for loop, every time it iterates, it multiplies only the ith row of a with all 3 columns of b.
	//i used c[i][j] to add each result into the c array. then printed the c array to show final result of multiplied matrix.
	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		double [][] c = new double[3][3];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				c[i][j] = 0;
				for (int k = 0; k < a.length; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		return c;
	}
		
}

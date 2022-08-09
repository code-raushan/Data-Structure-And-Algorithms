package Arrays;
import java.util.Scanner;
public class MultidimensionalArrays {

	public static void main(String[] args) {
		int mat[][]; //declares a 2D array
		mat = new int[3][3]; //creates a 3*3 array
		
		//setting the values
		Scanner scn = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				mat[i][j] = scn.nextInt();
			}
			System.out.println();
		}
				
		//for reading the values of all the pair of indexes
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		//basic problem in 2D arrays
		
		//Q.1. Sum of the rows in a 2D array
		int sum;
		for(int i=0; i<3; i++) {
			sum = 0;
			for(int j=0; j<3; j++) {
				sum = sum + mat[i][j];
			}
			System.out.println("Sum of row number " + i +  " = " + sum);
		}
		
		//Q.2. Read a matrix and check whether it is symmetric matrix or not.
		// A symmetric matrix must be a square matrix and transpose matrix should be the same as that of the original matrix
		
		int row, col;
		int matrix[][];
		int tmatrix[][];
		System.out.println("Enter number of rows");
		row = scn.nextInt();
		System.out.println("Enter number of columns");
		col = scn.nextInt();
		
		if(row != col) {
			System.out.println("not a symmetric matrix");
			return;
		}else {
			matrix = new int[row][col];
			tmatrix = new int[row][col];
			for(int i=0; i<row; i++) {
				for(int j=0; j<col; j++) {
					matrix[i][j] = scn.nextInt();
				}
			}
			
			//transpose matrix
			for(int i=0; i<row; i++) {
				for(int j=0; j<col; j++) {
					tmatrix[j][i] = matrix[i][j];
				}
			}
			
			//checking whether symmetric or not
			int flag=0;
			for(int i=0; i<row; i++) {
				for(int j=0; j<col; j++) {
					if(tmatrix[i][j] != matrix[i][j]) {
						flag = 1;
						break;
					}
				}
			}
			if(flag == 1) {
				System.out.println("matrix is not symmetric");
			}else {
				System.out.println("matrix is symmetric");
			}
			
		}		
	}
}

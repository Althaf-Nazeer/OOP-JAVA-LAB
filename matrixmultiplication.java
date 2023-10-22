import java.io.*;
import java.util.Scanner;

public class MatrixMultiplication {
	public static void main(String args[]) {
		int m, n, o, p, i, j, k;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no of rows of first matrix");
		m = in.nextInt();
		System.out.println("Enter the no of columns of first matrix");
		n = in.nextInt();
		System.out.println("Enter the no of rows of second matrix");
		o = in.nextInt();
		System.out.println("Enter the no of columns of second matrix");
		p = in.nextInt();
		if (n == o) {
			int a[][] = new int[m][n];
			int b[][] = new int[n][p];
			int c[][] = new int[m][p];
			System.out.println("Enter the elements of first matrix");
			for (i = 0; i < m; i++)
				for (j = 0; j < n; j++)
					a[i][j] = in.nextInt();
			System.out.println("Enter the elements of second matrix");
			for (i = 0; i < n; i++)
				for (j = 0; j < p; j++)
					b[i][j] = in.nextInt();
			for (i = 0; i < m; i++) {

				for (j = 0; j < p; j++) {
					for (k = 0; k < n; k++) {
						c[i][j] = c[i][j] + (a[i][k] * b[k][j]);

					}
				}
			}
			System.out.println("Resultant matrix");
			for (i = 0; i < m; i++) {
				for (j = 0; j < p; j++)
					System.out.print(c[i][j] + "\t");
				System.out.print("\n");
			}

		} else
			System.out.println("Matrix multiplication not possible");

	}
}

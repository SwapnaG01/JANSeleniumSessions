/*
 * Transpose of a Matrix
 */
package JavaProgrammes;

import java.util.Arrays;
import java.util.Scanner;

public class TransposeMatrix {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows for the matrix: ");
		
		int rows=sc.nextInt();
		System.out.println("Number of rows for the matrix is: "+rows);
		
		System.out.println("Enter number of columns for the matrix: ");
		
		int col=sc.nextInt();
		
		System.out.println("Number of columns for the matrix is: "+col);

		int matrix[][]=new int[rows][col];
		int transpose[][]=new int[rows][col];
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				matrix[i][j]=sc.nextInt();			
				}
		}
		System.out.println("Print the input matrix: ");
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
			System.out.print(matrix[i][j]+"");
			}
			System.out.println();
		}
		System.out.println("Create the transpose materix: ");
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				transpose[j][i]=matrix[i][j];
			}
		}
		for(int[] r:transpose)
		{
			System.out.println(Arrays.toString(r));
		}
		
	}
}

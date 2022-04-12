package JavaProgrammes;

import java.util.Scanner;

public class CreateMatrix {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter total number of rows: ");
		int rows=sc.nextInt();
		System.out.println("Enter the total number of columns: ");
		int col=sc.nextInt();
		
		int matrix[][]=new int[rows][col];
		
		System.out.println("Create the data");
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				matrix[i][j]=sc.nextInt();			}
		}
        
		System.out.println("Print the data");
		/*
		 * 
		 * for(int[] r: matrix)
		{
			System.out.println(Arrays.toString(r));
		}
		*/
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(matrix[i][j]+" ");		
				}
			System.out.println();
		}
		
	}

}

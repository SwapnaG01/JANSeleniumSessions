/*
 * Matrix addition subtraction
 */
package JavaProgrammes;

import java.util.Arrays;
import java.util.Scanner;

//Matrix addition will be done element to element
public class MatrixAdditionSutraction {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of rows for the matrix: ");
		int rows=sc.nextInt();
		
		System.out.println("Enter the number of columns for the matrix: ");
		int col=sc.nextInt();
		
	    int matrix1[][]=new int[rows][col];
	    int matrix2[][]=new int[rows][col];
	    int sum[][]=new int[rows][col];
		System.out.println("Create the matrix");
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				matrix1[i][j]=sc.nextInt();}
		}
		
	   System.out.println("Create the matrix");
	
	    for(int i=0;i<rows;i++)
	     {
		for(int j=0;j<col;j++)
		{
			matrix2[i][j]=sc.nextInt();}
	     }
	
	    System.out.println("Print the first matrix");
	     
	    for(int[] r:matrix1)
	    {
	    	System.out.println(Arrays.toString(r));
	    }
	    
	    System.out.println("Print the second matrix");
	    
	    for(int[] r:matrix2)
	    {
	    	System.out.println(Arrays.toString(r));
	    }
	 
	    System.out.println("sum of two matrices");
	     for(int i=0;i<rows;i++)
	     {
	    	 for(int j=0;j<col;j++)
	    	 {
	    		 sum[i][j]=matrix1[i][j]+matrix2[i][j];	
	    		 System.out.print(sum[i][j]+" ");
	    		 }
	    	 System.out.println();
	     }
	     System.out.println("sum of two matrices");
	     for(int i=0;i<rows;i++)
	     {
	    	 for(int j=0;j<col;j++)
	    	 {
	    		 sum[i][j]=matrix1[i][j]-matrix2[i][j];	
	    		 System.out.print(sum[i][j]+" ");
	    		 }
	    	 System.out.println();
	     }
	 
	}

	}

		
		


	



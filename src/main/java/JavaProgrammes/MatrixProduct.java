/*
 * Matrix multiplication.
 */
package JavaProgrammes;

import java.util.Arrays;
import java.util.Scanner;

//If inner number matches then only product is defined other wise undefined.
//i.e number of columns in the first matrix and number of rows in the second matrix should be same.
//Then the result matrix have number of rows of the first matrix as number of rows  and number of columns of second matrix as number of columns.
//Product is defined as rows multiplied by columns.
public class MatrixProduct {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of rows for the first matrix: ");
		
		int rowsinFirst=sc.nextInt();
		
		System.out.println("Enter the no of column of first matrix and no of rows of the second matrix:  ");
		
		int colinFirstrowsinSecond=sc.nextInt();
		
		System.out.println("Enter the no of columns for the second matrix: ");
		
		int colinSecond=sc.nextInt();
		
		
		
		int matrix1[][]=new int[rowsinFirst][colinFirstrowsinSecond];
		int matrix2[][]=new int[colinFirstrowsinSecond][colinSecond];
		int product[][]=new int[rowsinFirst][colinSecond];
		
		System.out.println("Enter data for first matrix");
		
		for(int i=0;i<rowsinFirst;i++)
		{
			for(int j=0;j<colinFirstrowsinSecond;j++)
			{
				matrix1[i][j]=sc.nextInt();
				
			}
		}
		
		System.out.println("Enter data for second matrix: ");
		
		for(int i=0;i<colinFirstrowsinSecond;i++)
		{
			for(int j=0;j<colinSecond;j++)
			{
				
				matrix2[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("Create first matrix");
		
		for(int i=0;i<rowsinFirst;i++)
		{
			for(int j=0;j<colinFirstrowsinSecond;j++)
			{
			
			System.out.print(matrix1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Create second matrix");
		
		for(int i=0;i<colinFirstrowsinSecond;i++)
		{
			for(int j=0;j<colinSecond;j++)
			{
				
		    System.out.print(matrix2[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Get the product of first matrix and second matrix: ");
		
		for(int i=0;i<rowsinFirst;i++)
		{
			for(int j=0;j<colinSecond;j++)
			{
				for(int k=0;k<colinFirstrowsinSecond;k++)
				{
					
			product[i][j]+=matrix1[i][k]	* matrix2[k][j];	
						
			}
		}
		}
		System.out.println("Print the product of two matrix is: ");
		
		for(int[] r:product)
		{
			System.out.println(Arrays.toString(r));
		}
		

	}

}

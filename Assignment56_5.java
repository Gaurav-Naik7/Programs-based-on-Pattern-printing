// Accept number of rows and number of columns from user and display below pattern

// Input : iRow=5  iCol=5

// Output :  
//	1 2 3 4 5 
//  1 2     5  
//  1   3   5
//	1     4 5
//	1 2 3 4 5
//	

import java.io.*;
import java.util.*;

class Assignment56_5
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number of rows : ");
		int iRow=sobj.nextInt();
		
		System.out.println("Enter number of columns : ");
		int iCol=sobj.nextInt();
	
		Pattern pobj=new Pattern();
		pobj.display(iRow,iCol);
	}
}

class Pattern
{
	public void display(int irow,int icol)
	{
		int i=0,j=0;
		
		for(i=1;i<icol+1;i++)
		{
			for(j=1;j<irow+1;j++)
			{
				if( i==1 || i==irow || j==1 || j==icol || i==j)
				{
					System.out.print(j+" ");
				}
			
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}	

	}
}

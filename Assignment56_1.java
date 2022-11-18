// Accept number of rows and number of columns from user and display below pattern

// Input : iRow=4  iCol=4

// Output :  
//	* * * # 
//  * * # *  
//  * # * *
//	# * * *

import java.io.*;
import java.util.*;

class Assignment56_1
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
		
		for(i=0;i<icol;i++)
		{
			for(j=irow-1;j>=0;j--)
			{
				if(i!=j)
				{
					System.out.print("*  ");
				}
				else
				{
					System.out.print("#  ");
				}
			}
			System.out.println();
		}	

	}
}

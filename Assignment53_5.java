// Accept number of rows and number of columns from user and display below pattern

// Input : iRow=3	iCol=4

// Output :  
//	1  1  1  1  
//  2  2  2  2  
//  3  3  3  3  
  

import java.io.*;
import java.util.*;

class Assignment53_5
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number of rows : ");
		int irow=sobj.nextInt();
		System.out.println("Enter number of columns : ");
		int icol=sobj.nextInt();
		
		Pattern pobj=new Pattern();
		pobj.display(irow,icol);
	}
}

class Pattern
{
	public void display(int iRow,int iCol)
	{
		int i=0,j=0;
		int iRet=1;

		for(i=0,iRet=1;i<iRow;i++,iRet++)
		{
			for(j=0;j<iCol;j++)
			{
				System.out.print(iRet+"  ");
			}
			System.out.println();
		}
	}
}

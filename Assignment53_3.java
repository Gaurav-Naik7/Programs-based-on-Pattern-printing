// Accept number of rows and number of columns from user and display below pattern

// Input : iRow=3	iCol=5

// Output :  
//	5  4  3  2  1
//  5  4  3  2  1
//  5  4  3  2  1

import java.io.*;
import java.util.*;

class Assignment53_3
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
		int iRet=iCol,temp=0;

		for(i=0;i<iRow;i++)
		{
			for(j=0,iRet=iCol;j<iCol;j++,iRet--)
			{
				System.out.print(iRet+"  ");
			}
			System.out.println();
		}
	}
}

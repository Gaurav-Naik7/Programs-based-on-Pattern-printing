// Accept number of rows and number of columns from user and display below pattern

// Input : iRow=4	iCol=4

// Output :  
//	A B C D 
//  A B C D 
//  A B C D 
//	A B C D  

import java.io.*;
import java.util.*;

class Assignment52_1
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
		char ch='A';
		char temp=ch;
		for(i=0;i<iCol;i++)
		{
			for(j=0;j<iRow;j++)
			{
				System.out.print(ch+"  ");
				ch++;
			}
			System.out.println();
			ch=temp;
		}
	}
}

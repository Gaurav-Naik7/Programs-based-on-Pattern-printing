// Accept number of rows and number of columns from user and display below pattern

// Input : iRow=3	iCol=5

//  Output :  
//	A  A  A  A  A
//  B  B  B  B  B
//  C  C  C  C  C


import java.io.*;
import java.util.*;

class Assignment52_3
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
		char ch='\0';
		char temp=ch;
		for(i=0,ch='A';i<iRow;i++,ch++)
		{
			for(j=0;j<iCol;j++)
			{
				System.out.print(ch+"  ");
			}
			System.out.println();									
		}
	}
}

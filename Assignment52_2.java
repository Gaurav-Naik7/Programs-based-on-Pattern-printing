// Accept number of rows and number of columns from user and display below pattern

// Input : iRow=4	iCol=4

// Output :  
//	A B C D 
//  a b c d 
//  A B C D 
//	a b c d 

import java.io.*;
import java.util.*;

class Assignment52_2
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
		for(i=0;i<iRow;i++)
		{
			if((i%2)==0)
			{
				for(j=0,ch='A';j<iCol;j++,ch++)
				{
					System.out.print(ch+"  ");
				}
				System.out.println();
			}
			else
			{
				for(j=0,ch='a';j<iCol;j++,ch++)
				{
					System.out.print(ch+"  ");
				}
				System.out.println();
			}
		}
	}
}

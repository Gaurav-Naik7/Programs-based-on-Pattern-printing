// Accept string from user and display below pattern

// Input : Hello

// Output :  
//  H 
//  H e 
//  H e l 
//	H e l l
//  H e l l o 
//  H e l l 
//  H e l 
//	H e 
//  H 


import java.io.*;
import java.util.*;

class Assignment54_5
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		String str=sobj.nextLine();
	
		
		Pattern pobj=new Pattern();
		pobj.display(str);
	}
}

class Pattern
{
	public void display(String str)
	{
		int i=0,j=0,x=0;
		char[] ch=str.toCharArray();
		
		for(i=0;i<ch.length-1;i++)
		{
			for(j=0;j<ch.length;j++)
			{
				if(i>=j)
				{
					System.out.print(ch[j]+"  ");
				}
			}

			System.out.println();
		}
		
		for(i=0;i<=ch.length-1;i++)
		{
			for(j=ch.length-1,x=0;j>=0;j--)
			{
				if(j>=i)
				{
					System.out.print(ch[x]+"  ");
					x++;
				}
			}
			
			System.out.println();
			
		}
		
		
	}
}

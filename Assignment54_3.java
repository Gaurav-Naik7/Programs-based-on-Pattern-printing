// Accept string from user and display below pattern

// Input : Hello

// Output :  
//	H 
//  H e 
//  H e l 
//	H e l l
//  H e l l o 

import java.io.*;
import java.util.*;

class Assignment54_3
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
		int i=0,j=0;
		char[] ch=str.toCharArray();
		

		
		for(i=0;i<ch.length;i++)
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
	}
}

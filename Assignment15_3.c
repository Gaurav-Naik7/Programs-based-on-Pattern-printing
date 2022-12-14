// Accept number from user and display below pattern :

// Input : iRow=5  iCol=5

// Output : a b c d e
//          1 2 3 4 5
//  	    a b c d e
//	    1 2 3 4 5
//          a b c d e

#include<stdio.h>

void Pattern(int iRow,int iCol)
{
	int i=0,j=0;
	char ch='\0';

	for(i=1;i<=iRow;i++)
	{
		if(i%2!=0)
		{
			for(j=1,ch='a';j<=iCol;j++,ch++)
			{
				printf("%c\t",ch);
			}
		}
		else
		{
			for(j=1;j<=iCol;j++)
			{
				printf("%d\t",j);
			}
		}
		printf("\n");
	}
}

int main()
{
	int iValue1=0,iValue2=0;
	
	printf("Please enter number of rows : ");
	scanf("%d",&iValue1);
	
	printf("Please enter number of columns : ");
	scanf("%d",&iValue2);
	
	Pattern(iValue1,iValue2);
	
	return 0;
}

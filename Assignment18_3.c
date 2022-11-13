// Accept number from user and display below pattern :

// Input : iRow=4  iCol=4

// Output : * * * *
//          *   * *
//  	    * *   *
//	    * * * *

#include<stdio.h>

void Pattern(int iRow,int iCol)
{
	int i=0,j=0;
	int iCnt=0;
	
	for(i=1;i<=iRow;i++)
	{
		for(j=iCol;j>=1;j--)
		{
			if(i==j || i==1 || i==iRow || j==1 || j==iCol)
			{
				printf("*\t");
			}
			else 
			{
				printf(" \t");
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

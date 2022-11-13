// Accept number from user and display below pattern :

// Input : iRow=5  iCol=5

// Output : 2 4 5 8 10
//          1 3 5 7 9
//  		2 4 6 8 10
//			1 3 5 7 9

#include<stdio.h>

void Pattern(int iRow,int iCol)
{
	int i=0,j=0;
	int iCnt1=0;
	int iCnt2=1;

	for(i=1;i<=iRow;i++)
	{
		if(i%2!=0)
		{
			for(j=1;j<=iCol;j++)
			{
				iCnt1=2*j;
				printf("%d\t",iCnt1);
			}
		}
		else
		{
			for(j=1;j<=iCol;j++)
			{
				iCnt2=2*j-1;
				printf("%d\t",iCnt2);
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
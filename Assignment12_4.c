// Accept number from user and display below pattern :

// Input : 5

// Output : # 1 * # 2 * # 3 * # 4 * # 5 *

#include<stdio.h>

void Pattern(int iNo)
{
	int iCnt=0;
	
	for(iCnt=1;iCnt<=iNo;iCnt++)
	{
		printf("#\t%d\t*\t",iCnt);
	}
}

int main()
{
	int iValue=0;
	
	printf("Please enter a number : ");
	scanf("%d",&iValue);
	
	Pattern(iValue);
	
	return 0;
}
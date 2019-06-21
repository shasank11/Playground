#include <stdio.h>
int main(void)

{	
	int p,q;

	scanf("%d %d",&p,&q);
	if(p>q)
	{
		printf("num1 is the greatest");	
}
	else if(q>p)
	{	
		printf("num2 is the greatest");	
    }
	else
	{
		printf("Both number Equal");
	}
	return 0;
}
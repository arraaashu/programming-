#include<stdio.h>
#include<conio.h>
void main()
{
int n,i,a[10];
void bsort(int[],int);
clrscr();
printf("\n enter no of ele in array:");
scanf("%d",&n);
printf("\n ele are:");
for(i=1;i<n;i++)
	scanf("%d",&a[i]);
for(i=1;i<n;i++)
	printf("\n ele=%d",a[i]);
bsort(a,n);
printf("\n sorted array is:");
for(i=1;i<n;i++)
printf("%5d",a[i]);
getch();
}
void bsort(int a[],int n)
{
int i,k,c;
	for(i=0;i<n-1;i++)
	{
		for(k=1;k<n-i-1;k++)
		{
			if(a[k]>a[k+1])
			{
				c=a[k];
				a[k]=a[k+1];
				a[k+1]=c;
			}
		}
	}
}


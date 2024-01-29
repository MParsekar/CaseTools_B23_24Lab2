#include<stdio.h>

void main()
{
    int arr1[2][2] ,arr2[2][2],i,j,sum[2][2];

    printf("Enter elements for array 1:");
    for(i=0;i<2;i++)
    {
        for(j=0;j<2;j++)
        {
            printf("%d",arr1[i][j]);
        }
    }

    printf("Enter elements for array 2:");
    for(i=0;i<2;i++)
    {
        for(j=0;j<2;j++)
        {
            printf("%d",arr2[i][j]);
        }
    }

    printf("Sum of array 1 and array 2:");
    for(i=0;i<2;i++)
    {
        for(j=0;j<2;j++)
        {
            sum[i][j]=arr1[i][j]+arr2[i][j];
            
        }
    }
    printf("sum= %d",sum[i][j]);
}
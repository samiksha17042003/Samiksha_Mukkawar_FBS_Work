#include <stdio.h>

void main() {
    int n1,n2,n3,n4,n5,sum,avg;
    printf("Enter the numbers:");
    scanf("%d %d %d %d %d",&n1,&n2,&n3,&n4,&n5);
    sum=n1+n2+n3+n4+n5;
    avg=sum/5;
    printf("Average of the numbers is %d",avg);
}
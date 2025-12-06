#include <stdio.h>

void main() {
    int a=12;
    int b=15;
    int temp;
    printf("Before Swapping\n ");
    printf("a=%d,b=%d\n",a,b);
    temp=b;
    b=a;
    a=temp;
    printf("After Swapping\n ");
    printf("a=%d,b=%d",a,b);
}
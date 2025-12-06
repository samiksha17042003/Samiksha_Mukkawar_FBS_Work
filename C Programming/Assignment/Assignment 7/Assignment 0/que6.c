#include <stdio.h>

void main() {
   int no,square,cube;
   printf("Enter the number:");
   scanf("%d",&no);
   square=no*no;
   cube=no*no*no;
   printf("%d square is %d and cube is %d",no,square,cube);
}
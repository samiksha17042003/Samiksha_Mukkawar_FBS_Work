#include <stdio.h>

void main() {
   int length,width,perimeter;
   printf("Enter the length:");
   scanf("%d",&length);
   printf("Enter the width:");
   scanf("%d",&width);
  perimeter=2*(length+width);
   printf("the perimeter of the rectangle is %d",perimeter);
}
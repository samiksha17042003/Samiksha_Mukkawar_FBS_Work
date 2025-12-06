#include <stdio.h>

void main() {
   int sub1,sub2,sub3,sub4,sub5,totalmarks,percentage;
   printf("Enter the sub1 marks:");
   scanf("%d",&sub1);
   printf("Enter the sub2 marks:");
   scanf("%d",&sub2);
   printf("Enter the sub3 marks:");
   scanf("%d",&sub3);
   printf("Enter the sub4 marks:");
   scanf("%d",&sub4);
   printf("Enter the sub5 marks:");
   scanf("%d",&sub5);
  totalmarks=sub1+sub2+sub3+sub4+sub5;
  percentage=totalmarks/5;
   printf("the totalmarks of the 5 subject is %d and percentage is %d",totalmarks,percentage);
}
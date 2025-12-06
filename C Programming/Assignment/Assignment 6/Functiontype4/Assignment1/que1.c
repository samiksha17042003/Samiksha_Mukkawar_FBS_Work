#include <stdio.h>
int sum(int,int,int);//fun declaration
void main() {
    int n1,n2,res;
    printf("Enter the number:");
    scanf("%d %d",&n1,&n2);
    int result=sum(n1,n2,res);//fun call
   printf("The sum of the number is %d",result);
}//main end
int sum(int x,int y,int z){//fun defination
    z=x+y;
   return z;
}
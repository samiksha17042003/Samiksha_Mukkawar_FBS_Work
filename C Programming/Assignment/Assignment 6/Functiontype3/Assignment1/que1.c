#include <stdio.h>
void sum(int,int,int);//fun declaration
void main() {
    int n1,n2,res;
    printf("Enter the number:");
    scanf("%d %d",&n1,&n2);
    sum(n1,n2,res);//fun call
}//main end
void sum(int x,int y,int z){//fun defination
    z=x+y;
    printf("The sum of the number is %d",z);
}
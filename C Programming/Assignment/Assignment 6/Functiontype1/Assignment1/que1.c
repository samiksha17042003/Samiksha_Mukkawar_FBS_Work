#include <stdio.h>
void sum();//fun declaration
void main() {
   sum();//fun call
}//main end
void sum(){//fun defination
    int n1,n2,res;
    printf("Enter the number:");
    scanf("%d %d",&n1,&n2);
    res=n1+n2;
    printf("The sum of the number is %d",res);
}
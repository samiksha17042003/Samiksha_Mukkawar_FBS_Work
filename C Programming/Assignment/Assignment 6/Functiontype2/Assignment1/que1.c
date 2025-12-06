#include <stdio.h>
int sum();//fun declaration
void main() {
int res=sum();//fun call
printf("The sum of the number is %d",res);

}//main end
int sum(){//fun defination
    int n1,n2,res;
    printf("Enter the number:");
    scanf("%d %d",&n1,&n2);
    res=n1+n2;
    return res;
}
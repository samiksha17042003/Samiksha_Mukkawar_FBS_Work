#include <stdio.h>
void main() {
    int n,r1,q1,r2,r3,rev;
    printf("Enter the number:");
    scanf("%d",&n);
    r1=n%10;
    q1=n/10;
    r2=q1%10;
    r3=q1/10;
    rev=r1*100+r2*10+r3;
    if(n==rev){
        printf("the number is pallindrome");
    }else{
        printf("the number is not pallindrome");
    }
}
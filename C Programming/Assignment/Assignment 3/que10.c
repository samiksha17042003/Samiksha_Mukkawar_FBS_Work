#include <stdio.h>
int main(){
    int num=12345,r1,sum,r2;
    r1=num%10;
    while(num>10){
        num=num/10;
    }
    sum=r1+num;
    printf("The addition of the first and last digite is %d",sum);
}


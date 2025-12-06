#include <stdio.h>
int Firstlast();//function declaration
void main(){
int res=Firstlast();
 printf("The addition of the first and last digite is %d",res);//calling
}
    int Firstlast(){//function defination
    int num=12345,r1,sum,r2;
    r1=num%10;
    while(num>10){
        num=num/10;
    }
    sum=r1+num;
    return sum;
}


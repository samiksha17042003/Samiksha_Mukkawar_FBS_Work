#include <stdio.h>
int Firstlast(int,int,int,int);//function declaration
int num=12345,r1,sum,r2;
void main(){
  Firstlast(num,r1,sum,r2);//calling
  printf("The addition of the first and last digite is %d",sum);
}
    int Firstlast(int num,int r1,int sum,int r2){//function defination
    r1=num%10;
    while(num>10){
        num=num/10;
    }
    sum=r1+num;
    return sum;
}


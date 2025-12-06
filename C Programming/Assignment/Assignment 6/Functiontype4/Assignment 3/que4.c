#include <stdio.h>
int Prime(int,int,int);//function declaration
void main(){
    int num,i=2,flag=0;
    printf("Enter the number:");
    scanf("%d",&num);
    int res= Prime(num,i,flag);
    if(res==1){
        printf("number is not prime number");
    }
    else{
        printf("number is prime number");
    }
}
    int Prime(int num,int i,int flag){//function defination
    while(i<num){
    if(num%i==0){
         flag==1;
         break;
    }
    if(flag==0){
        return 1;
        break;
    }
    else{
       return 0;
    }
    }
}
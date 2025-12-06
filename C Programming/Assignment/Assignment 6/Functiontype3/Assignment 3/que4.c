#include <stdio.h>
void Prime(int,int,int);//function declaration
void main(){
    int num,i=2,flag=0;
    printf("Enter the number:");
    scanf("%d",&num);
    Prime(num,i,flag);
}
    void Prime(int num,int i,int flag){//function defination
    while(i<num){
    if(num%i==0){
         flag==1;
         break;
    }
    if(flag==0){
        printf("%d is not prime number",num);
        break;
    }
    else{
        printf("%d is prime number",num);
    }
    }
}
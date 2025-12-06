#include <stdio.h>
int main(){
    int num,i=2,flag=0;
    printf("Enter the number:");
    scanf("%d",&num);
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
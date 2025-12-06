#include <stdio.h>
int Perfect();//function declaration
void main(){
  if(Perfect()){
        printf("number is perfect");
    }
    else{
        printf("number is not perfect");
    }
}
    int Perfect(){//function defination
    int num,sum=0;
    printf("Enter the number:");
    scanf("%d",&num);
    for(int i=1;i<=num/2;i++){
        if(num%i==0){
            sum=sum+i;
        }
    }
    if(sum==num){
       return 1;
    }
    else{
        return 0;
    }
    }
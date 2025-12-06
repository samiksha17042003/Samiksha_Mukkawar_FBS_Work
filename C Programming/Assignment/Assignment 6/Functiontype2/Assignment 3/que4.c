#include <stdio.h>
int Prime();//function declaration
void main(){
    
    if(Prime()){
        printf("number is not prime number");
    }
    else{
        printf("number is prime number");
    }
}
    int Prime(){//function defination
    int num,i=2,flag=0;
    printf("Enter the number:");
    scanf("%d",&num);
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
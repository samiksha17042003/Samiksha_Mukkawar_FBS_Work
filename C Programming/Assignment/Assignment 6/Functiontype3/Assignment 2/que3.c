#include <stdio.h>
void Greater(int,int,int);//function declaration
void main(){
    int no1,no2,no3;
    printf("Enter the numbers:");
    scanf("%d %d %d",&no1,&no2,&no3);
     Greater(no1,no2,no3);//function call
}
    void Greater(int n1,int n2,int n3){//function defination
    if(n1>n2){
        if(n1>n3){
            printf("%d is greatest",n1);
        }
        else{
            printf("%d is greatest",n3);
        }
    }
    else{
        if(n2>n3){
            printf("%d is greatest",n2);
        }
        else{
            printf("%d is greatest",n3);
        }

    }
    }
#include <stdio.h>
void Perfect(int,int);//function declaration
void main(){
    int num,sum=0;
    printf("Enter the number:");
    scanf("%d",&num);
    Perfect(num,sum);//calling
}
    void Perfect(int num,int sum){//function defination
    for(int i=1;i<=num/2;i++){
        if(num%i==0){
            sum=sum+i;
        }
    }
    if(sum==num){
        printf("%d is perfect number",num);
    }
    else{
        printf("%d is not perfect number",num);
    }
    }
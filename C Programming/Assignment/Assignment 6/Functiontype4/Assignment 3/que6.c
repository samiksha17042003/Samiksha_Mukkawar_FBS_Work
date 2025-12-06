#include <stdio.h>
int Perfect(int,int);//function declaration
void main(){
    int num,sum=0;
    printf("Enter the number:");
    scanf("%d",&num);
    int res=Perfect(num,sum);//calling
    if(res==1){
        printf("%d is perfect number",num);
    }
    else{
        printf("%d is not perfect number",num);
    }
}
    int Perfect(int num,int sum){//function defination
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
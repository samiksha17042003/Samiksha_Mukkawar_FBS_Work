#include <stdio.h>
int main(){
    int start,end;
    printf("Please enter the range to print armstrong numbers:");
    scanf("%d %d",&start,&end);
    printf(" armstrong number between %d to %d is:",start,end);
    for (int num=start; num <= end; num++) {
        int temp=num;
        int count=0;
        int sum=0;
    while(temp!=0){
        count++;
       temp=temp/10;
    }   
    temp=num;
    while(temp!=0){
       int r1=temp%10;
        int p=1;
        for(int i=0;i<count;i++){
            p=p*r1;
        }
        sum=sum+p;
        temp=temp/10;
        }
    if(sum==num){
        printf(" %d ",num);
    }
    }
}
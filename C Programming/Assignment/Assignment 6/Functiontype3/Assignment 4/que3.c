#include <stdio.h>
void strong(int,int,int);
void main(){
    int start,end,r;
    printf("Enter the range to find strong numbers: ");
    scanf("%d %d",&start,&end);
    strong(start,end,r);
}
    void  strong(int start,int end,int r){//function defination
    for(int num=start;num<=end;num++){
        int temp=num;
        int sum=0;
    while(temp>0){
       r=temp%10;
       int fact=1;
       for(int i = 1; i <=r; i++) {
        fact *= i;
    }
       sum=sum+fact;
       temp=temp/10;
       
    }
   if(sum==num){
     printf("%d is strong number\n",num);
   }
}
    }
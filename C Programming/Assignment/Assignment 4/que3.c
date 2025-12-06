#include <stdio.h>
int main(){
    int start,end,r;
    printf("Enter the range to find strong numbers: ");
    scanf("%d %d",&start,&end);
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
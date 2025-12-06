#include <stdio.h>
void perfectrange();//function declaration
void main(){
   perfectrange();//calling
}
    void perfectrange(){//function defination
    int start,end;
    printf("Please enter the range to print perfect numbers:");
    scanf("%d %d",&start,&end);
    printf("perfect number between %d to %d is:\n",start,end);
    for(int num=start;start<end;start++){
    int num=start,r,sum=0;
    int temp=num;
    while(temp>0){
       r=temp%10;
       int fact=1;
       for(int i = 1; i <=r; i++) {
        fact *= i;
    }
       sum=sum+fact;
       temp=temp/10;
       
    }
   if(num==sum){
     printf("%d is strong number\n",num);
   }
        }
    }
    
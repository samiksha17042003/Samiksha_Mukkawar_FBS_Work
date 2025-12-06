#include <stdio.h>
int Sum(int,int,int);//function declaration
void main(){
    int start;
    int end,sum=0;
    printf("Enter the range:");
    scanf("%d %d",&start,&end);
   int res=Sum(start,end,sum);//calling
   printf("The sum of range number is %d",res);
}
    int Sum(int start,int end,int sum){//function defination
    while(start<=end){
        sum=sum+start;
        start++;
    }
     return sum;
}
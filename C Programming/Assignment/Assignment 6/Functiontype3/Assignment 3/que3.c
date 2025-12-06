#include <stdio.h>
void Sum(int,int,int);//function declaration
void main(){
    int start;
    int end,sum=0;
    printf("Enter the range:");
    scanf("%d %d",&start,&end);
    Sum(start,end,sum);//calling
 
}
    void Sum(int start,int end,int sum){//function defination
    while(start<=end){
        sum=sum+start;
        start++;
    }
     printf("%d\n",sum);
}
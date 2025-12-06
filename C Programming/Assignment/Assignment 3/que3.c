#include <stdio.h>
int main(){
    int start;
    int end,sum=0;
    printf("Enter the range:");
    scanf("%d %d",&start,&end);
    while(start<=end){
        sum=sum+start;
        start++;
    }
     printf("%d\n",sum);
}
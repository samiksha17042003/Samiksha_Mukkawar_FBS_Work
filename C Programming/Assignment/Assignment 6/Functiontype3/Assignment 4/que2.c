#include <stdio.h>
void primerange(int,int,int);//function declaration
void main(){
    int start,end,flag;
    printf("Enter the range to print the prime:");
    scanf("%d %d",&start,&end);
   primerange(start,end,flag);//calling
}
    void primerange(int start,int end,int flag){//function defination
     for(start;start<=end;start++){
        flag=0;
        for(int i=2;i<=start/2;i++){
        if(start%i==0){
            flag=1;
            break;
        }
    }
        if(flag==0){
             printf(" %d ",start);
        }
    }
}

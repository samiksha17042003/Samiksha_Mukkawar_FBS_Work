#include <stdio.h>
void primerange();//function declaration
void main(){
   primerange();//calling
}
    void primerange(){//function defination
    int start,end,flag;
    printf("Enter the range to print the prime:");
    scanf("%d %d",&start,&end);
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

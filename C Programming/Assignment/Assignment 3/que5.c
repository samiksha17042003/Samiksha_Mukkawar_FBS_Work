#include <stdio.h>
int main(){
    int num=153,r1,sum=0,count=0,p,i;
    int temp=num;
    while(temp!=0){
      //  sum=sum+r1*r1*r1;
        count++;
       temp=temp/10;
    }   
    temp=num;
    while(temp!=0){
        r1=temp%10;
        p=1;
        for(i=1;i<=count;i++){
            p=p*r1;
        }
       sum=sum+p;
        temp=temp/10;
    }if(num==sum){
        printf("%d is armstrong number",num);
    }
    else{
        printf("%d is not armstrong number",num);
    }
    }
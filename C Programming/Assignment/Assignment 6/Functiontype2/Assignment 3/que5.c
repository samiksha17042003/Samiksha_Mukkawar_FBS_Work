#include <stdio.h>
int Armstrong();//function declaration
void main(){
   if(Armstrong()){
        printf("number is armstrong number");
    }
    else{
        printf("number is not armstrong number");
    }
}
    int Armstrong(){//function defination
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
        return 1;
    }
    else{
        return 0;
    }
    }
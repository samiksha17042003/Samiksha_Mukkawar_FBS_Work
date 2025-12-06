#include <stdio.h>
int Armstrong(int,int,int,int,int,int,int);//function declaration
void main(){
    int num=153,r1,sum=0,count=0,p,i;
    int temp=num;
    int res=Armstrong(num,r1,sum,count,p,i,temp);//calling
    if(res==1){
        printf("%d is armstrong number",num);
    }
    else{
        printf("%d is not armstrong number",num);
    }
}
    int Armstrong(int num,int r1,int sum,int count,int p,int i,int temp){//function defination
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
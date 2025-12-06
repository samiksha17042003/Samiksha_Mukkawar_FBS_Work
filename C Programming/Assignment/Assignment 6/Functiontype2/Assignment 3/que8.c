#include <stdio.h>
int Strong();//function declaration
void main(){
if(Strong()){
     printf("number is strong");
   }else{
     printf("number is not strong ");
   } //calling
}
    int Strong(){//function defination
    int num,r,sum=0;
    //int i=num;
    printf("Enter the number: ");
    scanf("%d",&num);
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
    return 1;
   }else{
     return 0;
   }
}
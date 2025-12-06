#include <stdio.h>
int Strong(int,int,int,int);//function declaration
void main(){
  int num,r,sum=0;
    //int i=num;
    printf("Enter the number: ");
    scanf("%d",&num);
    int temp=num;
    int res=Strong(num,r,sum,temp);//calling
    if(res==1){
     printf("%d is strong number",num);
   }else{
     printf("%d is not strong number",num);
   }

}
    int Strong(int num,int r,int sum,int temp){//function defination
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
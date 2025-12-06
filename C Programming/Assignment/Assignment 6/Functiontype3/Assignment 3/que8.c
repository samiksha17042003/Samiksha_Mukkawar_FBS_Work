#include <stdio.h>
void Strong(int,int,int,int);//function declaration
void main(){
  int num,r,sum=0;
    //int i=num;
    printf("Enter the number: ");
    scanf("%d",&num);
    int temp=num;
    Strong(num,r,sum,temp);//calling

}
    void Strong(int num,int r,int sum,int temp){//function defination
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
     printf("%d is strong number",num);
   }else{
     printf("%d is not strong number",num);
   }
}
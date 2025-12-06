#include <stdio.h>
int Divisiblity();//function declaration
void main(){
     int res=Divisiblity();//function call
if(res==1){
printf("number is divisible by both");
}else if(res==2){
printf("number is divisible by 3");
}else if(res==3){
    printf("number is divisible by 5");
}
 else{
printf("number is not divisible by both");
    }
}
 int Divisiblity(){//function defination
    int num;
printf("Enter the number:");
scanf("%d",&num);
if(num%3==0&&num%5==0){
return 1;
}else if(num%3==0){
return 2;
}else if(num%5==0){
   return 3;
}
 else{
return 4;
    }
}

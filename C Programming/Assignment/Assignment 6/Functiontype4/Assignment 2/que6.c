#include <stdio.h>
int Divisiblity(int);//function declaration
void main(){
int no;
printf("Enter the number:");
scanf("%d",&no);
int res=Divisiblity(no);//function call
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
 int Divisiblity(int num){//function defination
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


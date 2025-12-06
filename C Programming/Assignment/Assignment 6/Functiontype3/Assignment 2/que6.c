#include <stdio.h>
void Divisiblity(int);//function declaration
void main(){
int no;
printf("Enter the number:");
scanf("%d",&no);
     Divisiblity(no);//function call
}
 void Divisiblity(int num){//function defination
if(num%3==0&&num%5==0){
printf("%d is divisible by both",num);
}else if(num%3==0){
printf("%d is divisible by 3",num);
}else if(num%5==0){
    printf("%d is divisible by 5",num);
}
 else{
printf("%d is not divisible by both",num);
    }
}

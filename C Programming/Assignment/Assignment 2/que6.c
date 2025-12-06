#include <stdio.h>
void main(){
    int num;
printf("Enter the number:");
scanf("%d",&num);
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

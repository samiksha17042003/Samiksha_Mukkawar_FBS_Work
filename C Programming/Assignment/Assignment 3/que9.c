#include <stdio.h>
int main(){
    int num,r1,rev=0;
    printf("Enter the number:");
    scanf("%d",&num);
    int temp=num;
    while(num>0){
        r1=num%10;
        rev=rev*10+r1;
        num=num/10;
    }if(temp==rev){
        printf("%d is palindrome number",temp);
    }
    else{
        printf("%d is not palindrome number",temp);
    }
    }
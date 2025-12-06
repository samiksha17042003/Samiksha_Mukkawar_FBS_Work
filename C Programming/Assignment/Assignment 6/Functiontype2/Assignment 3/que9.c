#include <stdio.h>
int Palindrome();//function declaration
void main(){
 if(Palindrome()){
        printf("number is palindrome");
    }
    else{
        printf("number is not palindrome");
    }//calling
}
    int Palindrome(){//function defination
    int num,r1,rev=0;
    printf("Enter the number:");
    scanf("%d",&num);
    int temp=num;
    while(num>0){
        r1=num%10;
        rev=rev*10+r1;
        num=num/10;
    }if(temp==rev){
        return 1;
    }
    else{
        return 0;
    }
    }
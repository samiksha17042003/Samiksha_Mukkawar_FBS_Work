#include <stdio.h>
int Palindrome(int,int,int,int);//function declaration
void main(){
    int num,r1,rev=0;
    printf("Enter the number:");
    scanf("%d",&num);
    int temp=num;
  int res=Palindrome(num,r1,rev,temp);//calling
    if(res==1){
        printf("%d is palindrome number",temp);
    }
    else{
        printf("%d is not palindrome number",temp);
    }

}
    int Palindrome(int num,int r1,int rev,int temp){//function defination
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
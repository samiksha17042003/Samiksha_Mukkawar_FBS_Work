#include <stdio.h>
int Factorial();//function declaration
void main(){
  int res=Factorial();//calling
  printf("factorial is %d",res);
}
    int Factorial(){//function defination
    int num,fact=1;
    printf("Enter the number to calculate the factorial of the given number: ");
    scanf("%d",&num);
    int i=num;
    while(i>1){
       fact=fact*i;
       i--;
    }
    return fact;
}
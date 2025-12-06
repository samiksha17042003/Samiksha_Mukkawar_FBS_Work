#include <stdio.h>
void Factorial();//function declaration
void main(){
  Factorial();//calling
}
    void Factorial(){//function defination
    int num,fact=1;
    printf("Enter the number to calculate the factorial of the given number: ");
    scanf("%d",&num);
    int i=num;
    while(i>1){
       fact=fact*i;
       i--;
    }
    printf("factorial of %d is %d",num,fact);
}
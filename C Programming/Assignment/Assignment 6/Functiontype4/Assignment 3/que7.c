#include <stdio.h>
int Factorial(int,int,int);//function declaration
void main(){
  int num,fact=1;
    printf("Enter the number to calculate the factorial of the given number: ");
    scanf("%d",&num);
    int i=num;
    int res=Factorial(num,fact,i);//calling
    printf("factorial of %d is %d",num,fact);
}
    int Factorial(int num,int fact,int i){//function defination
    while(i>1){
       fact=fact*i;
       i--;
    }
   return fact;
}
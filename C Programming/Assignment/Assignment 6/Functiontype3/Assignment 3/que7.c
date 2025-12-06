#include <stdio.h>
void Factorial(int,int,int);//function declaration
void main(){
  int num,fact=1;
    printf("Enter the number to calculate the factorial of the given number: ");
    scanf("%d",&num);
    int i=num;
    Factorial(num,fact,i);//calling
}
    void Factorial(int num,int fact,int i){//function defination
    while(i>1){
       fact=fact*i;
       i--;
    }
    printf("factorial of %d is %d",num,fact);
}
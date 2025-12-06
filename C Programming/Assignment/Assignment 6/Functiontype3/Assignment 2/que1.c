#include <stdio.h>
void operation(int,int,int,char);//function declaration
void main(){
    int no1,no2,res;
    char operators;
    printf("Please enter the two numbers:");
    scanf("%d\n %d",&no1,&no2);
    printf("Enter the operators(+,-,*,/):");
    scanf(" %c",&operators);
     operation(no1,no2,res,operators);//function call
}
    void operation(int n1,int n2,int result,char operator ){//function defination
    if( operator=='+'){
        result=n1+n2;
        printf("Addition of two number is %d",result);
    }else if( operator=='-'){
        result=n1-n2;
        printf("Substraction of two number is %d",result);
    }else if( operator=='*'){
        result=n1*n2;
     printf("Multiplaction of two number is %d",result);
    }else if( operator=='/'){
        if(n2!=0){
            result=n1/n2;
            printf("Division of two number is %d",result);
        }
        else{
         printf("Divided by zero is not allowed");
        }
    }else if( operator=='%'){
        result=n1%n2;
        printf("Modules of two number is %d",result);
    }else{
        printf("Error:Invalide Operator.");
    }
}

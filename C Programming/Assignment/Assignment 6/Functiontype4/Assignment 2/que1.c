#include <stdio.h>
void operation();//function declaration
void main(){
     operation();//function call
}
    void operation(){//function defination
    int n1,n2,result;
    char operator;
    printf("Please enter the two numbers:");
    scanf("%d\n %d",&n1,&n2);
    printf("Enter the operator(+,-,*,/):");
    scanf(" %c",&operator);
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

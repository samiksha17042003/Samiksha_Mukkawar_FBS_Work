#include <stdio.h>
void result(int);//function declaration
void main(){
     int marks;
    printf("Enter the marks:");
    scanf("%d",&marks);
     result(marks);//function call
}
    void result(int marks){//function defination
    if(marks>=75){
        printf("Distication");
    }else if(marks>=65){
         printf("Firstclass");
    }else if(marks>=55){
         printf("secondclass");
    }else if(marks>=40){
         printf("pass class");
    }else{
        printf("fail");
    }
}

    
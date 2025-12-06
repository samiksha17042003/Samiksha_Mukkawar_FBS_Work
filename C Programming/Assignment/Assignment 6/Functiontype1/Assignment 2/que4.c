#include <stdio.h>
void result();//function declaration
void main(){
     result();//function call
}
    void result(){//function defination
    int marks;
    printf("Enter the marks:");
    scanf("%d",&marks);
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

    
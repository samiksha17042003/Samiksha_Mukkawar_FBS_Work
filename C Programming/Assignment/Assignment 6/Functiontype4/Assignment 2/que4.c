#include <stdio.h>
int result(int);//function declaration
void main(){
int marks;
printf("Enter the marks:");
scanf("%d",&marks);
int res=result(marks);//function call
if(res==1){
        printf("Distication");
    }else if(res==2){
         printf("Firstclass");
    }else if(res==3){
         printf("secondclass");
    }else if(res==4){
         printf("pass class");
    }else{
        printf("fail");
    }
}
    int result(int marks){//function defination
    if(marks>=75){
       return 1;
    }else if(marks>=65){
         return 2;
    }else if(marks>=55){
         return 3;
    }else if(marks>=40){
          return 4;
    }else{
          return 5;
    }
}

    
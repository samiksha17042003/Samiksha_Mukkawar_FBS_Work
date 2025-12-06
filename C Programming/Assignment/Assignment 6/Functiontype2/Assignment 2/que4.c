#include <stdio.h>
int result();//function declaration
void main(){
int res=result();//function call
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
    int result(){//function defination
    int marks;
    printf("Enter the marks:");
    scanf("%d",&marks);
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

    
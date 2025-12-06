#include <stdio.h>
int triangle();//function declaration
void main(){
    int res=triangle();//function call
    if(res==1){
        printf("the triangle is equilateral.");
    }else if(res==2){
         printf("the triangle is isosceles.");
    }else{
       printf("the triangle is scalene.");
    }
}
    int triangle(){//function defination
    int s1,s2,s3;
    printf("Enter the the side of the triangle:");
    scanf("%d %d %d",&s1,&s2,&s3);
    if(s1==s2&&s2==s3){
        return 1;
    }else if(s1==s2||s2==s3||s1==s3){
        return 2;
    }else{
        return 3;
    }
}

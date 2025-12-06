#include <stdio.h>
void triangle();//function declaration
void main(){
     triangle();//function call
}
    void triangle(){//function defination
    int s1,s2,s3;
    printf("Enter the the side of the triangle:");
    scanf("%d %d %d",&s1,&s2,&s3);
    if(s1==s2&&s2==s3){
         printf("the triangle is equilateral.");
    }else if(s1==s2||s2==s3||s1==s3){
        printf("the triangle is isosceles.");
    }else{
        printf("the triangle is scalene.");
    }
}

#include <stdio.h>
void triangle(int,int,int);//function declaration
void main(){
    int s1,s2,s3;
    printf("Enter the the side of the triangle:");
    scanf("%d %d %d",&s1,&s2,&s3);
     triangle(s1,s2,s3);//function call
}
    void triangle(int s1,int s2,int s3){//function defination
    if(s1==s2&&s2==s3){
         printf("the triangle is equilateral.");
    }else if(s1==s2||s2==s3||s1==s3){
        printf("the triangle is isosceles.");
    }else{
        printf("the triangle is scalene.");
    }
}

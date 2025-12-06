#include <stdio.h>
int triangle(int,int,int);//function declaration
void main(){
    int s1,s2,s3;
    printf("Enter the the side of the triangle:");
    scanf("%d %d %d",&s1,&s2,&s3);
    int res=triangle(s1,s2,s3);//function call
    if(res==1){
        printf("the triangle is equilateral.");
    }else if(res==2){
         printf("the triangle is isosceles.");
    }else{
       printf("the triangle is scalene.");
    }
}
    int triangle(int s1,int s2,int s3){//function defination
    if(s1==s2&&s2==s3){
        return 1;
    }else if(s1==s2||s2==s3||s1==s3){
        return 2;
    }else{
        return 3;
    }
}

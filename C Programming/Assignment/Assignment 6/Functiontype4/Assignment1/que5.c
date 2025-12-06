#include <stdio.h>
void vote();

//fun declaration
void main() {
    vote();//calling
}
void vote(){//defination
    int age;
    printf("Enter the age:");
    scanf("%d",&age);
    
    if(age>=18){
        printf("Eligible for Voting");
    }else{
         printf(" Not Eligible for Voting");
}
}
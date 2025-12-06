#include <stdio.h>
int vote(int);

//fun declaration
void main() {
    int age;
    printf("Enter the age:");
    scanf("%d",&age);
    int res=vote(age);
if(res==1){
     printf("Eligible for Voting");   //calling
}
else{
     printf("Not Eligible for Voting");
}
}
int vote(int age){//defination
    int age;
    printf("Enter the age:");
    scanf("%d",&age);
    
    if(age>=18){
        return 1;
    }else{
         return 0;
}
}
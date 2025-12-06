#include <stdio.h>
int vote();

//fun declaration
void main() {
    if(vote()){
     printf("Eligible for Voting");   //calling
}
else{
     printf("Not Eligible for Voting");
}
}
int vote(){//defination
    int age;
    printf("Enter the age:");
    scanf("%d",&age);
    
    if(age>=18){
        return 1;
    }else{
         return 0;
}
}
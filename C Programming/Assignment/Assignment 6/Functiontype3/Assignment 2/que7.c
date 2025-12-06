#include <stdio.h>
void Age(int);//function declaration
void main(){
int age;
printf("Enter the age:");
scanf("%d",&age);
     Age(age);//function call
}
 void Age(int age){//function defination
if(age<12){
    printf("child");
} else if(age>=12 && age<=19){
    printf("Teenager");
}
else if(age>=20 && age<=59){
    printf("Adult");
}
else if(age>=60){
    printf("Senior");
}
}
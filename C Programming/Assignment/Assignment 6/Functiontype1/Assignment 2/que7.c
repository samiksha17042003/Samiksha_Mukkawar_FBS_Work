#include <stdio.h>
void age();//function declaration
void main(){
     age();//function call
}
 void age(){//function defination
int age;
printf("Enter the age:");
scanf("%d",&age);
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
#include <stdio.h>
int age();//function declaration
void main(){
   int res=age();//function call
     if(res==1){
    printf("child");
} else if(res==2){
    printf("Teenager");
}
else if(res==3){
    printf("Adult");
}
else{
    printf("Senior");
}
}
int age(){//function defination
int age;
printf("Enter the age:");
scanf("%d",&age);
if(age<12){
    return 1;
} else if(age>=12 && age<=19){
   return 2;
}
else if(age>=20 && age<=59){
   return 3;
}
else if(age>=60){
  return 4;
}
}
#include <stdio.h>
void prices(double,double,double,char);//function declaration
void main(){
double price,totalprice,discount=0;
char student;
printf("Enter the price:");
scanf("%lf",&price);
printf("Enter the if you are student(say y or n):");
scanf(" %c",&student);
prices(price,totalprice,discount,student);//function call
}
void prices(double price,double totalprice,double discount,char student){//function defination

if(student=='y'){
    if(price>500)
    totalprice=price-price*0.20;
    else
    totalprice=price-price*0.10;

}
else{
    if(price>600)
    totalprice=price-price*0.20;
    else
    totalprice=price;

}
if(discount==0)
printf("the final price of customer is %lf",totalprice);
else
printf("the final price of customer with %lf discount is %1f",discount,totalprice);
}